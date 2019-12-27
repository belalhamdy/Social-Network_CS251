public class Comment {
    private String id;
    private String content;
    private User writer;
    private Post post;

    Comment(String content, User writer, Post post){
        this.content = content;
        this.post = post;
        this.writer = writer;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public void setWriter(User writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public String getId() {
        return id;
    }

    public Post getPost() {
        return post;
    }

    public User getWriter() {
        return writer;
    }
}
