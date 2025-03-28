public class PlayableApplication {
    public static void main(String[] args) {
        PlayableInterface audioPlayer = new AudioPlayer();
        audioPlayer.play();
        PlayableInterface videoPlayer = new VideoPlayer();
        videoPlayer.play();
    }
}
