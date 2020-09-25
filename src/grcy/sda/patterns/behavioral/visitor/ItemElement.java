package grcy.sda.patterns.behavioral.visitor;

public interface ItemElement {

	int accept(ItemVisitor visitor);

}
