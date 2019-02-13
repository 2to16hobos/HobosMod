package magical.mod.capabilities;

public interface IMana {
	
    public void consume(float points);

    public void fill(float points);

    public void set(float points);

    public void setManaLevel(int points);

    public void upManaLevel(int points);
    
    public int getManaLevel();

    public void setMaxMana(float points);

    public float getMaxMana();

    public float getMana();
    
    


}
