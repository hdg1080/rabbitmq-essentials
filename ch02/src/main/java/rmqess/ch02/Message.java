package rmqess.ch02;


import java.io.Serializable;



public class Message implements Serializable {
	
	private static final long serialVersionUID = -4098151609470073353L;
	private long senderId;
	private long addresseeId;
	private String subject;
	private String content;
	private String topic;
	private long timeSend;
	
	public Message() {
		
	}
	
	public Message(long senderId, long addresseeId, String subject, String content, String topic, long timeSend) {
		this.senderId = senderId;
		this.addresseeId = addresseeId;
		this.subject = subject;
		this.content = content;
		this.topic = topic;
		this.timeSend = timeSend;
		
		
	}
	
	public long getSenderId() {
		return senderId;
	}

	public void setSenderId(long senderId) {
		this.senderId = senderId;
	}

	public long getAddresseeId() {
		return addresseeId;
	}

	public void setAddresseeId(long addresseeId) {
		this.addresseeId = addresseeId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public long getTimeSend() {
		return timeSend;
	}

	public void setTimeSend(long timeSend) {
		this.timeSend = timeSend;
	}

	public Message withSenderId(long senderId){
		this.senderId = senderId;
		return this;
	}
	public Message withAddresseeId(long addresseeId){
		this.addresseeId = addresseeId;
		return this;
	}
	
	public Message withSubject(String subject){
		this.subject = subject;
		return this;
	}
	
	public Message withContent(String content){
		this.content = content;
		return this;
	}

	public Message withTimeSent(long timeSend){
		this.timeSend = timeSend;
		return this;
	}
	
	public Message withTopic(String topic){
		this.topic = topic;
		return this;
	}

	
	@Override
	public String toString() {
		return "(" + senderId + ", " + addresseeId+", " + subject + ", " + content + ", "+ topic + ", " + timeSend + ")";
	}

	

}
