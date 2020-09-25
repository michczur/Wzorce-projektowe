package grcy.sda.patterns.behavioral.visitor;

public interface ItemVisitor {

	int visit(Item1 item1); //spożywka
	int visit(Item2 item2); //agd
	//int visit(Item3 item3); //budowlanka
}
