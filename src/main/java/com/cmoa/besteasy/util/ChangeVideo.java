package com.cmoa.besteasy.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ChangeVideo {
	public static void main(String[] args) {
		//asx，asf，mpg，wmv，3gp，mp4，mov，avi，flv
		ChangeVideo.convert("D:\\ffmpeg3\\input\\aa.avi", "D:\\ffmpeg3\\input\\aa2.mp4");
	}
	/**
	 * @param inputFile:需要转换的视频
	 * @param outputFile：转换后的视频w
	 * @return
	 */
	public static boolean convert(String inputFile, String outputFile) {
		if (!checkfile(inputFile)) {
			System.out.println(inputFile + " is nokt file");
			return false;
		}
		
		/* 格式转换 */
		boolean process = process(inputFile, outputFile);
		System.out.println(process);
		if (process) {
			System.out.println("ok");
			return true;
		}
		return false;
	}

	// 检查文件是否存在
	private static boolean checkfile(String path) {
		File file = new File(path);
		if (!file.isFile()) {
			System.out.println("文件不存在");
			return false;
		}
		System.out.println("存在");
		return true;
	}

	/**
	 * @param inputFile
	 * @param outputFile
	 * @return
	 * 转换视频文件
	 */
	private static boolean process(String inputFile, String outputFile) {
		int type = checkContentType(inputFile);
		boolean status = false;
		if (type == 0) {
			status = processFLV(inputFile, outputFile);// 直接将文件转换
		} else if (type == 1) {
			String avifilepath = processAVI(type, inputFile);
			if (avifilepath == null)
				return false;// avi文件没有得到
			status = processFLV(avifilepath, outputFile);// 将avi转为flv
		}
		return status;
	}

	private static int checkContentType(String inputFile) {
		String type = inputFile.substring(inputFile.lastIndexOf(".") + 1,
				inputFile.length()).toLowerCase();
		// ffmpeg能解析的格式：（asx，asf，mpg，wmv，3gp，mp4，mov，avi，flv等）
		if (type.equals("avi")) {
			return 0;
		} else if (type.equals("mpg")) {
			return 0;
		} else if (type.equals("wmv")) {
			return 0;
		} else if (type.equals("3gp")) {
			return 0;
		} else if (type.equals("mov")) {
			return 0;
		} else if (type.equals("mp4")) {
			return 0;
		} else if (type.equals("asf")) {
			return 0;
		} else if (type.equals("asx")) {
			return 0;
		} else if (type.equals("flv")) {
			return 0;
		}
		// 对ffmpeg无法解析的文件格式(wmv9，rm，rmvb等),
		// 可以先用别的工具（mencoder）转换为avi(ffmpeg能解析的)格式.
		else if (type.equals("wmv9")) {
			return 1;
		} else if (type.equals("rm")) {
			return 1;
		} else if (type.equals("rmvb")) {
			return 1;
		}
		return 9;
	}
	// ffmpeg能解析的格式：（asx，asf，mpg，wmv，3gp，mp4，mov，avi，flv等）直接转换为目标视频
	private static boolean processFLV(String inputFile, String outputFile) {
		if (!checkfile(inputFile)) {
			System.out.println(inputFile + " is not file");
			return false;
		}
		List<String> commend = new ArrayList<String>();
		commend.add(Constants.ffmpegPath);
		
		/**
		 * 测试代码
		 */
		
		/*commend.add("-i");
		commend.add(inputFile);
		
		commend.add("-ab");
		commend.add("128");
		commend.add("-acodec");
		commend.add("libmp3lame");
	
		commend.add("-ac");
		commend.add("1");
		commend.add("-ar");
		commend.add("22050");
		commend.add("-r");
		commend.add("29.97");
		
		commend.add("-crf");
		commend.add("22");
		
		commend.add("-preset");	
		commend.add("fast");	
		
		commend.add("-y");
		commend.add(outputFile);*/
		
		/* ---------------------------------------------*/
		commend.add("-i");
		commend.add(inputFile);
		
		commend.add("-ab");
		commend.add("128");
		commend.add("-acodec");
		commend.add("libmp3lame");
	
		commend.add("-ac");
		commend.add("1");
		commend.add("-ar");
		commend.add("22050");
		commend.add("-r");
		commend.add("29.97");
		
		commend.add("-vcodec");
		commend.add("h264");                                                                                                                                                                                                                                                                                                   
		commend.add("-crf");
		commend.add("38");
		commend.add("-threads");
		commend.add("8");
		
		
		commend.add("-preset");	
		commend.add("fast");	
		
		commend.add("-y");
		commend.add(outputFile);
		//------------------------------------
		StringBuffer test = new StringBuffer();
		for (int i = 0; i < commend.size(); i++) {
			test.append(commend.get(i) + " ");
		}

		System.out.println(test);

		try {
			ProcessBuilder builder = new ProcessBuilder();
			builder.command(commend);
			
			//设置进程生成器是否合并标准错误和标准输出
			builder.redirectErrorStream(true);
            //转换开始返回Process 对象

            Process pr = builder.start();

            //通过Process 获取时时状态信息
			BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			//等待进程执行完毕
            if(pr.waitFor() != 0){
                   //如果进程运行结果不为0,表示进程是错误退出的
                   //获得进程实例的错误输出
                   InputStream error = pr.getErrorStream();
                   System.out.println(error);
                   return false;
                   //do something
            }
            InputStream sdin = pr.getInputStream(); //获得进程实例的标准输出
            //do something
            System.out.println(sdin);
			return true;
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("出错了");
			return false;
		}
	}
	// 对ffmpeg无法解析的文件格式(wmv9，rm，rmvb等),
	// 可以先用别的工具（mencoder）转换为avi(ffmpeg能解析的)格式.
	private static String processAVI(int type, String inputFile) {
		File file = new File(Constants.avifilepath);
		if (file.exists())
			file.delete();
		List<String> commend = new ArrayList<String>();
		commend.add(Constants.mencoderPath);
		commend.add(inputFile);
		commend.add("-oac");
		commend.add("mp3lame");
		commend.add("-lameopts");
		commend.add("preset=64");
		commend.add("-ovc");
		commend.add("xvid");
		commend.add("-xvidencopts");
		commend.add("bitrate=600");
		commend.add("-of");
		commend.add("avi");
		commend.add("-o");
		commend.add(Constants.avifilepath);
		StringBuffer test = new StringBuffer();
		for (int i = 0; i < commend.size(); i++) {
			test.append(commend.get(i) + " ");
		}

		System.out.println(test);
		try {
			ProcessBuilder builder = new ProcessBuilder();
			builder.command(commend);
			Process p = builder.start();

			final InputStream is1 = p.getInputStream();
			final InputStream is2 = p.getErrorStream();
			new Thread() {
				public void run() {
					BufferedReader br = new BufferedReader(
							new InputStreamReader(is1));
					try {
						String lineB = null;
						while ((lineB = br.readLine()) != null) {
							if (lineB != null)
								System.out.println(lineB);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
			new Thread() {
				public void run() {
					BufferedReader br2 = new BufferedReader(
							new InputStreamReader(is2));
					try {
						String lineC = null;
						while ((lineC = br2.readLine()) != null) {
							if (lineC != null)
								System.out.println(lineC);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();

			// 等Mencoder进程转换结束，再调用ffmepg进程
			p.waitFor();
			System.out.println("who cares");
			return Constants.avifilepath;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}
}

