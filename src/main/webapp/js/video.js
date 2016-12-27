var videoDiv = document.getElementById('videoDiv');
var video = videoDiv.querySelector('div.videoDiv video');
video.addEventListener("click", clickVideo, false);
var divProgress = videoDiv.querySelector('div.progress');
divProgress.addEventListener("click", clickDivProgress, false);

function clickVideo() {
    if (video.paused) {
        video.play();
        var times = setInterval(function() {
            if (!video.ended) {
                var duration = video.duration;
                var currentTime = video.currentTime;
                var span = video.parentNode.nextElementSibling.children[0];
                var progressNum = currentTime / duration * 100;
                if (progressNum < 98) {
                    video.parentNode.nextElementSibling.children[0].style.left = progressNum + "%";
                    video.parentNode.nextElementSibling.children[2].style.width = progressNum + 1 + "%";
                } else {
                    video.parentNode.nextElementSibling.children[0].style.left = "98%";
                    video.parentNode.nextElementSibling.children[2].style.width = "99%";
                }
            } else {
                clearInterval(times);
                video.parentNode.nextElementSibling.children[0].style.left = 0;
                video.parentNode.nextElementSibling.children[2].style.width = 0;
            };
        }, 100);
    } else {
        video.pause();
    }
}

function clickDivProgress(event) {
    var eWidth = event.offsetX || event.layerX;
    video.currentTime = (video.duration / this.offsetWidth) * eWidth;
    if (video.paused) {
        video.pause();
        var progressNum = video.currentTime / video.duration * 100;
        if (progressNum < 98) {
            video.parentNode.nextElementSibling.children[0].style.left = progressNum + "%";
            video.parentNode.nextElementSibling.children[2].style.width = progressNum + 1 + "%";
        } else {
            video.parentNode.nextElementSibling.children[0].style.left = "98%";
            video.parentNode.nextElementSibling.children[2].style.width = "99%";
        }
    } else {
        video.play();
        var times = setInterval(function() {
            if (!video.ended) {
                var duration = video.duration;
                var currentTime = video.currentTime;
                var span = video.parentNode.nextElementSibling.children[0];
                var progressNum = currentTime / duration * 100;
                if (progressNum < 98) {
                    video.parentNode.nextElementSibling.children[0].style.left = progressNum + "%";
                    video.parentNode.nextElementSibling.children[2].style.width = progressNum + 1 + "%";
                } else {
                    video.parentNode.nextElementSibling.children[0].style.left = "98%";
                    video.parentNode.nextElementSibling.children[2].style.width = "99%";
                }
            } else {
                clearInterval(times);
                video.parentNode.nextElementSibling.children[0].style.left = 0;
                video.parentNode.nextElementSibling.children[2].style.width = 0;
            };
        }, 100);
    }
}

function playAndPause() {
    if (video.paused) {
        video.play();
        var times = setInterval(function() {
            if (!video.ended) {
                var duration = video.duration;
                var currentTime = video.currentTime;
                var span = video.parentNode.nextElementSibling.children[0];
                var progressNum = currentTime / duration * 100;
                if (progressNum < 98) {
                    video.parentNode.nextElementSibling.children[0].style.left = progressNum + "%";
                    video.parentNode.nextElementSibling.children[2].style.width = progressNum + 1 + "%";
                } else {
                    video.parentNode.nextElementSibling.children[0].style.left = "98%";
                    video.parentNode.nextElementSibling.children[2].style.width = "99%";
                }
            } else {
                clearInterval(times);
                video.parentNode.nextElementSibling.children[0].style.left = 0;
                video.parentNode.nextElementSibling.children[2].style.width = 0;
            };
        }, 100);
    } else {
        video.pause();
    }
}

function playbackRateUp() {
    var changeRate = video.playbackRate;
    if (changeRate < 8) {
        video.playbackRate = changeRate * 2;
    } else {
        video.playbackRate = 1;
    }
}

function playbackRateDown() {
    var changeRate = video.playbackRate;
    if (changeRate > 0.125) {
        video.playbackRate = changeRate / 2;
    } else {
        video.playbackRate = 1;
    }
}

function getCurrentTime() {


    console.log("当前播放时间：" + video.currentTime + "秒，视频总时长：" + video.duration + "秒。");
}

function refurbish() {


    video.load();
}

function changeURL(agt) {
    console.log(agt.innerHTML);
    agt.parentNode.previousElementSibling.innerHTML = agt.innerHTML;
    video.setAttribute("src", "./source/a1-vb-38.mp4");
    video.load();
}
//编辑字幕
var name = '未命名';
var editorSubtitle=document.getElementById('editorSubtitle');
var input = editorSubtitle.querySelector('form input');
var textarea =editorSubtitle.getElementsByTagName('textarea')[0];

input.addEventListener('change', function() {
    var files = this.files;
    var file = files.item(0);
    name = file.name;
    var reader = new FileReader();
    reader.onloadend = function(e) {
        textarea.value = e.target.result;
    };
    reader.readAsText(file, 'utf-8');
});

function fake_click(obj) {
    var mevt = new MouseEvent("click");
    obj.dispatchEvent(mevt);
}

document.getElementsByTagName('button')[0].addEventListener('click', function(e) {
    var urlObject = window.URL || window.webkitURL || window;
    var export_blob = new Blob([textarea.value]);
    var save_link = document.createElementNS("http://www.w3.org/1999/xhtml", "a")
    save_link.href = urlObject.createObjectURL(export_blob);
    save_link.download = name;
    fake_click(save_link);
});
