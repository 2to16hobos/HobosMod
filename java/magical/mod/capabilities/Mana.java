package magical.mod.capabilities;

import ibxm.Player;
import net.minecraft.entity.player.EntityPlayer;

public class Mana implements IMana{
	
    private float mana = 100.0F;

    private int manaLevel = 1;

    private float MaxMana = 250.0F;


    @Override
    public void upManaLevel(int points)
    {
    	this.manaLevel += points;
    }


    @Override
    public void setManaLevel(int points)
    {
    	this.manaLevel = points;
    }

    @Override
    public void setMaxMana(float points)
    {
    	this.MaxMana += points;
    }

    @Override
    public float getMaxMana()
    {
    	return this.MaxMana;
    }
	
    @Override
    public void consume(float points)
    {
        this.mana -= points;

        if (this.mana < 0.0F) this.mana = 0.0F;
    }

    @Override
    public void fill(float points)
    {
        this.mana += points;

        if (this.mana > this.MaxMana) this.mana = this.MaxMana;
    }

    @Override
    public void set(float points)
    {
        this.mana = points;
    }

    @Override
    public int getManaLevel()
    {
    	return this.manaLevel;
    }
    
    @Override
    public float getMana()
    {
    	return this.mana;
    }

	

}
