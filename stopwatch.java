package stopwatch1;

public class watch {		private long start =0;
		private long stop = 0;
		public final void start() {
			start = System.currentTimeMillis();
		}
		
		public final void start() {
			stop = System.currentTimeMillis();
		}
		public final String elapseTime() {
			long difference;
			if (stop == 0) {
				long now = System.currentTimeMillis();
				difference = (now - start);
			} else {
				difference = (stop - start);
			}
			long mils = difference % 100;
			difference = (difference - mils) / 1000;
			long sec = difference % 60;
			difference = (difference - sec) / 60;
			long minutes = difference % 60;
			difference = (difference - minutes) / 60;
			long hours = difference % 24;
			difference = (difference - hours) / 24;
			long days = difference;
			String message = "";
			if (days > 0) {
				message = days + "days and" + hours + " hours";
			} else if(hours > 0) {
				message = hours + "hours and" + minutes + " minutes";
			} else if(minutes > 0) {
				message = minutes + "minutes and" + sec + " sec";
			} else if(sec > 0) {
				message = sec + "sec and" + mils + " millisecond";
			} else {
				message = mils + " millisecond";
			}
			return message;
		}
		
}
