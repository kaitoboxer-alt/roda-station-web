<script>
// 1. ベースURLを共通部分までに留める
  const ROOT_URL = "https://media.roda-station.com/RODA-STATION/";

  const images = [
ROOT_URL  + 'photos/photo001.webp' ,
ROOT_URL  + 'photos/photo002.webp' ,
ROOT_URL  + 'photos/photo003.webp' ,
ROOT_URL  + 'photos/photo004.webp' ,
ROOT_URL  + 'photos/photo005.webp' ,
ROOT_URL  + 'photos/photo006.webp' ,
ROOT_URL  + 'photos/photo007.webp' ,
ROOT_URL  + 'photos/photo008.webp' ,
ROOT_URL  + 'photos/photo009.webp' ,
ROOT_URL  + 'photos/photo010.webp' ,
ROOT_URL  + 'photos/photo011.webp' ,
ROOT_URL  + 'photos/photo012.webp' ,
ROOT_URL  + 'photos/photo013.webp' ,
ROOT_URL  + 'photos/photo014.webp' ,
ROOT_URL  + 'photos/photo015.webp' ,
ROOT_URL  + 'photos/photo016.webp' ,
ROOT_URL  + 'photos/photo017.webp' ,
ROOT_URL  + 'photos/photo018.webp' ,
ROOT_URL  + 'photos/photo019.webp' ,
ROOT_URL  + 'photos/photo020.webp' ,
ROOT_URL  + 'photos/photo021.webp' ,
ROOT_URL  + 'photos/photo022.webp' ,
ROOT_URL  + 'photos/photo023.webp' ,
ROOT_URL  + 'photos/photo024.webp' ,
ROOT_URL  + 'photos/photo025.webp' ,
ROOT_URL  + 'photos/photo026.webp' ,
ROOT_URL  + 'photos/photo027.webp' ,
ROOT_URL  + 'photos/photo028.webp' ,
ROOT_URL  + 'photos/photo029.webp' ,
ROOT_URL  + 'photos/photo030.webp' ,
ROOT_URL  + 'photos/photo031.webp' ,
ROOT_URL  + 'photos/photo032.webp' ,
ROOT_URL  + 'photos/photo033.webp' ,
ROOT_URL  + 'photos/photo034.webp' ,
ROOT_URL  + 'photos/photo035.webp' ,
ROOT_URL  + 'photos/photo036.webp' ,
ROOT_URL  + 'photos/photo037.webp' ,
ROOT_URL  + 'photos/photo038.webp' ,
ROOT_URL  + 'photos/photo039.webp' ,
ROOT_URL  + 'photos/photo040.webp' ,
ROOT_URL  + 'photos/photo041.webp' ,
ROOT_URL  + 'photos/photo042.webp' ,
ROOT_URL  + 'photos/photo043.webp' ,
ROOT_URL  + 'photos/photo044.webp' ,
ROOT_URL  + 'photos/photo045.webp' ,
ROOT_URL  + 'photos/photo046.webp' ,
ROOT_URL  + 'photos/photo047.webp' ,
ROOT_URL  + 'photos/photo048.webp' ,
ROOT_URL  + 'photos/photo049.webp' ,
ROOT_URL  + 'photos/photo050.webp' ,
ROOT_URL  + 'photos/photo051.webp' ,
ROOT_URL  + 'photos/photo052.webp' ,
ROOT_URL  + 'photos/photo053.webp' ,
ROOT_URL  + 'photos/photo054.webp' ,
ROOT_URL  + 'photos/photo055.webp' ,
ROOT_URL  + 'photos/photo056.webp' ,
ROOT_URL  + 'photos/photo057.webp' ,
ROOT_URL  + 'photos/photo058.webp' ,
ROOT_URL  + 'photos/photo059.webp' ,
ROOT_URL  + 'photos/photo060.webp' ,
ROOT_URL  + 'photos/photo061.webp' ,
ROOT_URL  + 'photos/photo062.webp' ,
ROOT_URL  + 'photos/photo063.webp' ,
ROOT_URL  + 'photos/photo064.webp' ,
ROOT_URL  + 'photos/photo065.webp' ,
ROOT_URL  + 'photos/photo066.webp' ,
ROOT_URL  + 'photos/photo067.webp' ,
ROOT_URL  + 'photos/photo068.webp' ,
ROOT_URL  + 'photos/photo069.webp' ,
ROOT_URL  + 'photos/photo070.webp' ,
ROOT_URL  + 'photos/photo071.webp' ,
ROOT_URL  + 'photos/photo072.webp' ,
ROOT_URL  + 'photos/photo073.webp' ,
ROOT_URL  + 'photos/photo074.webp' ,
ROOT_URL  + 'photos/photo075.webp' ,
ROOT_URL  + 'photos/photo076.webp' ,
ROOT_URL  + 'photos/photo077.webp' ,
ROOT_URL  + 'photos/photo078.webp' ,
ROOT_URL  + 'photos/photo079.webp' ,
ROOT_URL  + 'photos/photo080.webp' ,
ROOT_URL  + 'photos/photo081.webp' ,
ROOT_URL  + 'photos/photo082.webp' ,
ROOT_URL  + 'photos/photo083.webp' ,
ROOT_URL  + 'photos/photo084.webp' ,
ROOT_URL  + 'photos/photo085.webp' ,
ROOT_URL  + 'photos/photo086.webp' ,
ROOT_URL  + 'photos/photo087.webp' ,
ROOT_URL  + 'photos/photo088.webp' ,
ROOT_URL  + 'photos/photo089.webp' ,
ROOT_URL  + 'photos/photo090.webp' ,
ROOT_URL  + 'photos/photo091.webp' ,
ROOT_URL  + 'photos/photo092.webp' ,
ROOT_URL  + 'photos/photo093.webp' ,
ROOT_URL  + 'photos/photo094.webp' ,
ROOT_URL  + 'photos/photo095.webp' ,
ROOT_URL  + 'photos/photo096.webp' ,
ROOT_URL  + 'photos/photo097.webp' ,
ROOT_URL  + 'photos/photo098.webp' ,
ROOT_URL  + 'photos/photo099.webp' ,
ROOT_URL  + 'photos/photo100.webp' ,
ROOT_URL  + 'photos/photo101.webp' ,
ROOT_URL  + 'photos/photo102.webp' ,
ROOT_URL  + 'photos/photo103.webp' ,
ROOT_URL  + 'photos/photo104.webp'
  ];

  const videos = [
    ROOT_URL  + 'movies/photo001.mp4',
    ROOT_URL  + 'movies/photo002.mp4',
    ROOT_URL  + 'movies/photo003.mp4',
    ROOT_URL  + 'movies/photo004.mp4',
    ROOT_URL  + 'movies/photo005.mp4',
    ROOT_URL  + 'movies/photo006.mp4',
    ROOT_URL  + 'movies/photo007.mp4',
    ROOT_URL  + 'movies/photo008.mp4',
    ROOT_URL  + 'movies/photo009.mp4'
  ];

  const imgElement = document.getElementById('display-image');
  const videoElement = document.getElementById('display-video');

  let imagePlayCount = 0;
  let lastImgIndex = -1;
  let lastVidIndex = -1;

  function playNextMedia() {
    if (imagePlayCount < 7) {
      // --- 画像フェーズ ---
      let randIdx;
      do {
        randIdx = Math.floor(Math.random() * images.length);
      } while (randIdx === lastImgIndex && images.length > 1);
      lastImgIndex = randIdx;

      videoElement.style.display = 'none';
      videoElement.pause();
      
      // CloudflareからWebPを読み込み
      imgElement.src = images[randIdx];
      imgElement.style.display = 'block';

      imagePlayCount++;
      setTimeout(playNextMedia, 3000);

    } else {
      // --- 動画フェーズ ---
      let randIdx;
      do {
        randIdx = Math.floor(Math.random() * videos.length);
      } while (randIdx === lastVidIndex && videos.length > 1);
      lastVidIndex = randIdx;

      imgElement.style.display = 'none';
      
      // CloudflareからMP4を読み込み
      videoElement.src = videos[randIdx];
      videoElement.style.display = 'block';
      videoElement.play();

      imagePlayCount = 0; 
      videoElement.onended = playNextMedia;
    }
  }

  window.onload = playNextMedia;
</script>