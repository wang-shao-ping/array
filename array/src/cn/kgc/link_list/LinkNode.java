package cn.kgc.link_list;

public class LinkNode {
	private LinkNode next;
	private Object content;
	private LinkNode pre;
	public LinkNode(LinkNode pre, Object content, LinkNode next) {
		super();
		this.next = next;
		this.content = content;
		this.pre = pre;
	}
	public LinkNode() {
		super();
	}
	public LinkNode getNext() {
		return next;
	}
	public void setNext(LinkNode next) {
		this.next = next;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	public LinkNode getPre() {
		return pre;
	}
	public void setPre(LinkNode pre) {
		this.pre = pre;
	}
	
}
