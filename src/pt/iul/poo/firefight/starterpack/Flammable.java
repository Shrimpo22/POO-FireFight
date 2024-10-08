package pt.iul.poo.firefight.starterpack;

public interface Flammable {
	
	double getProbability();
	
	public void setProbability(int probability);
	
	int getTurnsToBurn();
	
	void setTurnsToBurn(int turnsToBurn);
	
	int getImmunity();
	
	void setVulnerability();
	
	boolean burnt();
	
	void setBurnt(boolean burnt);
	
	void burn();
	
	void douse();
}
