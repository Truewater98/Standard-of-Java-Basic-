package sevenchapter;
	class MyTv{
		private boolean isPowerOn;
		private int channel;
		private int volume;
		private int previousChannel;
		
		final int MAX_VOLUME = 100;
		final int MIN_VLOUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;
		
		public void setIsPowerOn(boolean isPowerOn) {
			this.isPowerOn = isPowerOn;
		}
		
		public boolean getIspowerOn() {
			return isPowerOn;
		}
		
		public void setChannel(int channel) {
			if(0 < channel && channel <= 100) {
			previousChannel = this.channel;
			this.channel = channel;
			}
		}
		
		public int getChannel() {
			return channel;
		}
		
		public void setVolume(int volume) {
			if(0 <= volume && volume <= 100)
			this.volume = volume;
		}
		
		public int getVolume() {
			return volume;
		}
		
		public void gotoPrevChannel() {
			setChannel(previousChannel);
		}
	}
public class exercise7_4_5 {
	public static void main(String[] args) {
		MyTv mytv = new MyTv();
		mytv.setChannel(10);
		System.out.println("CH:" + mytv.getChannel());
		mytv.setChannel(20);
		System.out.println("CH:" + mytv.getChannel());
		mytv.gotoPrevChannel();
		System.out.println("CH:" + mytv.getChannel());
		mytv.gotoPrevChannel();
		System.out.println("CH:" + mytv.getChannel());
	}
}
