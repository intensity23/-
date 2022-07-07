package chapter9;

public class Button {
	OnClickListener listener;
	
	void setInClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	static interface OnClickListener{
		void onClick();
		
	}

}
