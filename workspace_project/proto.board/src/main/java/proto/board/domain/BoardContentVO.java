package proto.board.domain;

public class BoardContentVO {
    private int documentSrl;
    private String title;
    private String content;
    private String nickname;
    private String email;
    private String regdate;

    public int getDocumentSrl() {
        return documentSrl;
    }

    public void setDocumentSrl(int documentSrl) {
        this.documentSrl = documentSrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }
}
