package interface01;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}
//        private int volume;
//        
//        @Override
//        public void turnOn() {
//        	System.out.println("Audio를 켭니다.");
//        }
//        public void turnOff() {
//        	System.out.println("Audio를 끕니다.");
//        }
//	@Override
//	public void setVolume(int volume) {
//		if(volume>RemoteControl.MAX_VOULE) {
//			this.volume = RemoteControl.MAX_VOULE;
//		}else if(volume<RemoteControl.MIN_VOULE) {
//
//	        this.volume = RemoteControl.MIN_VOULE;
//		} else {
//			this.volume = volume;
//			
//		}
//        
//        System.out.println("현재 Audio 볼륨: + volume");
//        
//	}
	
}
