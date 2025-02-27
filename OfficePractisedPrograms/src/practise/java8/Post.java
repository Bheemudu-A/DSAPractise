package practise.java8;

public class Post {
	
	private int userId;
	private int likes;
	private String content;
	
	
	public Post(int userId, int likes, String content) {
		super();
		this.userId = userId;
		this.likes = likes;
		this.content = content;
	}

	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getLikes() {
		return likes;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Post [userId=" + userId + ", likes=" + likes + ", content=" + content + "]";
	}
	
	

}
