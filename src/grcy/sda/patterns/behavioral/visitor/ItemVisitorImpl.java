package grcy.sda.patterns.behavioral.visitor;

public class ItemVisitorImpl implements ItemVisitor {

	@Override
	public int visit(Item1 item1) {
		int cost=0;
		//apply 5$ discount
		if(item1.getCommonValue() > 50){
			cost = item1.getCommonValue()-5;
		}else cost = item1.getCommonValue();
		System.out.println("Item1::"+item1.getItemValue() + " cost ="+cost);
		return cost;
	}

	@Override
	public int visit(Item2 item2) {
		int cost = item2.getCommonValue();
		System.out.println(item2.getName() + " cost = "+cost);
		return cost;
	}

}
