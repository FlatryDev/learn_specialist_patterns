package obsever;

import java.util.ArrayList;

public class Publisher {
	private ArrayList<Listener> lstnrs = new ArrayList<>();
	

	public Publisher addListener(Listener lstnr) {
		this.lstnrs.add(lstnr);
		return this;
	};
	
	public void deleteListener(Listener lstnr) {
		lstnrs.remove(lstnr);
	};
	
	public void sendNotify() {
		for (Listener listener : lstnrs) {
			if (listener != null) {
				listener.proccessForPublisher();
			}
		}
	}
}
