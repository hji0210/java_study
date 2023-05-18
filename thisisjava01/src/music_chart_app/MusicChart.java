package music_chart_app;

public class MusicChart {
	private Song[] songArray;//배열타입
	
	public MusicChart(Song[] songArray){
            this.songArray=songArray;
    }

	public Song[] getSongArray() {
		return songArray;
	}

	public void setSongArray(Song[] songArray) {
		this.songArray = songArray;
	}
	
	public void printMusicChart() {
		//class이름이랑 달라서 메소드이고 뮤직차트앱에서 mc의 메소드
		System.out.println("======Music Chart======");
		for(int i=0; i<songArray.length; i++) {
			System.out.println((i + 1)+".");
			System.out.println("제목=" + songArray[i].getTitle());
			System.out.println("가수=" + songArray[i].getSinger());
		    System.out.println("앨범=" + songArray[i].getAlbum());
		    System.out.println("작곡자=" + songArray[i].getComposer());
		    System.out.println("작사가=" + songArray[i].getLyricist());
		    System.out.println("발매일=" + songArray[i].getReleaseDate().substring(0,4) + "." + songArray[i].getReleaseDate().substring(4,6) + "." + songArray[i].getReleaseDate().substring(6,8));
		    System.out.println();
		}
	}
	   
	
	
	
	
}
