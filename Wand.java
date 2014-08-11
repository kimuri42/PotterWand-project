import java.util.HashMap;
public class Wand extends PotterWand
{
	//question answers
	private String artifact;
	private String height;
	private String fear;
	private String birthDate;
	private String pride;
	private String eyeColor;
	private String path;
	
	//wand variables
	private String wandCore;
	private String wandWood;
	private String wandFlex;
	private double wandLength;
	
	//wand length and flex detail
	String lengthInfo = "Many wandmakers simply match the wand length to the size of the witch or wizard " +
			"who will use it, but this is a crude measure, and fails to take into account many other, " +
			"important considerations. In my experience, longer wands might suit taller wizards, but they " +
			"tend to be drawn to bigger personalities, and those of a more spacious and dramatic style of magic. " +
			"Neater wands favour more elegant and refined spell-casting. However, no single aspect of wand " +
			"composition should be considered in isolation of all the others, and the type of wood, the core " +
			"and the flexibility may either counterbalance or enhance the attributes of the wand�s length. " +
			
			"\nMost wands will be in the range of between nine and fourteen inches. While I have sold extremely " +
			"short wands (eight inches and under) and very long wands (over fifteen inches), these are exceptionally rare. " +
			"In the latter case, a physical peculiarity demanded the excessive wand length. However, abnormally " +
			"short wands usually select those in whose character something is lacking, rather than because they are " +
			"physically undersized (many small witches and wizards are chosen by longer wands). " +
			
			"\nWand flexibility or rigidity denotes the degree of adaptability and willingness to change possessed " +
			"by the wand-and-owner pair - although, again, this factor ought not to be considered separately from the " +
			"wand wood, core and length, nor of the owner�s life experience and style of magic, all of which will combine " +
			"to make the wand in question unique.";
	
	//map
	HashMap<String,String> wCore = new HashMap<String,String>();
	HashMap<String,String> wWood = new HashMap<String,String>();
	
	//default constructor
	public Wand()
	{
		artifact = null;
		height = null;
		fear = null;
		birthDate = null;
		pride = null;
		eyeColor = null;
		path = null;
		
		wandCore = null;
		wandWood = null;
		wandFlex = null;
		wandLength = 0;
		
		//populate core explanations
		popWCore();		
		//populate wood explanations
		popWWood();
	}
	
	public void setArtifact(int artifactAnswer)
	{
		switch(artifactAnswer)
		{
		case 1:	artifact = "Dusty Bottle";
				break;
		case 2:	artifact = "Old Black Glove";
				break;
		case 3: artifact = "Golden Key";
				break;
		case 4: artifact = "Bound-up Scroll";
				break;
		case 5: artifact = "Glittering Jewel";
				break;
		case 6: artifact = "Silver Dagger";
				break;
		case 7: artifact = "Ornate Mirror";
				break;
		default: System.out.println("Invalid response. Input the number of your selection.");
				break;
		}
	}
	public String returnArtefact()
	{
		return artifact;
	}
	public void setBirthDate(int date)
	{
		switch(date)
		{
		case 1: birthDate = "Even";
			break;
		case 2: birthDate = "Odd";
			break;
		default: System.out.println("Invalid response. Input the number of your selection.");
			break;
		}
		
	}
	public String returnBirthDate()
	{
		return birthDate;
	}
	public void setEyeColor(int color)
	{
		switch(color)
		{
		case 1: this.eyeColor = "Brown/Black";
				break;
		case 2: this.eyeColor = "Light Brown";
				break;
		case 3: this.eyeColor = "Hazel";
				break;
		case 4: this.eyeColor = "Green";
				break;
		case 5: this.eyeColor = "Blue";
				break;
		case 6: this.eyeColor = "Blue-grey";
				break;
		case 7: this.eyeColor = "Blue-green";
				break;
		case 8: this.eyeColor = "Grey";
				break;
		case 9: this.eyeColor = "Other";
				break;
		default: System.out.println("Invalid response. Input the number of your selection.");
				break;
		}
	}
	public String returnEyeColor()
	{
		return eyeColor;
	}
	public void setFear(int fear)
	{
		switch(fear)
		{
		case 1: this.fear = "Fire";
			break;
		case 2: this.fear = "Darkness";
			break;
		case 3: this.fear = "Heights";
			break;
		case 4: this.fear = "Small spaces";
			break;
		case 5: this.fear = "Isolation";
			break;
		default: System.out.println("Invalid response. Input the number of your selection.");
			break;
		}
	}
	public String returnFear()
	{
		return fear;
	}
	public void setHeight(int height)
	{
		switch(height)
		{
		case 1: this.height = "short";
				break;
		case 2: this.height = "average";
				break;
		case 3: this.height = "tall";
				break;
		default: System.out.println("Invalid response. Input the number of your selection.");
				break;
		}
	}
	public String returnHeight()
	{
		return height;
	}
	public void setPath(int path)
	{
		switch(path)
		{
		case 1: this.path = "Left, towards the sea";
				break;
		case 2: this.path = "Ahead, towards the forest";
				break;
		case 3: this.path = "Right, towards the castle";
				break;
		default: System.out.println("Invalid response. Input the number of your selection.");
				break;
		}
	}
	public String returnPath()
	{
		return path;
	}
	public void setPride(int pride)
	{
		switch(pride)
		{
		case 1: this.pride = "Resilience";
			break;
		case 2: this.pride = "Intelligence";
			break;
		case 3: this.pride = "Determination";
			break;
		case 4: this.pride = "Originality";
			break;
		case 5: this.pride = "Kindness";
			break;
		case 6: this.pride = "Optimism";
			break;
		case 7: this.pride = "Imagination";
			break;
		default: System.out.println("Invalid response. Input the number of your selection.");
			break;
		}
	}
	public String returnPride()
	{
		return pride;
	}
	public void calcWandCore()
	{
		if (fear == "Darkness")
		{
			switch(artifact)
			{
			case "Dusty Bottle": wandCore = "Dragon Heartstring";
				break;
			case "Old Black Glove": wandCore = "Dragon Heartstring";
				break;
			case "Golden Key": wandCore = "Phoenix Feather";
				break;
			case "Bound-up Scroll": wandCore = "Phoenix Feather";
				break;
			case "Glittering Jewel": wandCore = "Phoenix Feather";
				break;
			case "Silver Dagger": wandCore = "Dragon Heartstring";
				break;
			case "Ornate Mirror": wandCore = "Unicorn Hair";
				break;
			default: System.out.println("Error: Artifact");
				break;
			}
		}
		else if (fear == "Fire")
		{
			switch(artifact)
			{
			case "Dusty Bottle": wandCore = "Unicorn Hair";
				break;
			case "Old Black Glove": wandCore = "Dragon Heartstring";
				break;
			case "Golden Key": wandCore = "Unicorn Hair";
				break;
			case "Bound-up Scroll": wandCore = "Unicorn Hair";
				break;
			case "Glittering Jewel": wandCore = "Unicorn Hair";
				break;
			case "Silver Dagger": wandCore = "Dragon Heartstring";
				break;
			case "Ornate Mirror": wandCore = "Unicorn Hair";
				break;
			default: System.out.println("Error: Artifact");
				break;
			}
		}
		else if (fear == "Heights")
		{
			switch(artifact)
			{
			case "Dusty Bottle": wandCore = "Unicorn Hair";
				break;
			case "Old Black Glove": wandCore = "Dragon Heartstring";
				break;
			case "Golden Key": wandCore = "Unicorn Hair";
				break;
			case "Bound-up Scroll": wandCore = "Unicorn Hair";
				break;
			case "Glittering Jewel": wandCore = "Unicorn Hair";
				break;
			case "Silver Dagger": wandCore = "Dragon Heartstring";
				break;
			case "Ornate Mirror": wandCore = "Unicorn Hair";
				break;
			default: System.out.println("Error: Artifact");
				break;
			}
		}
		else if (fear == "Small spaces")
		{
			switch(artifact)
			{
			case "Dusty Bottle": wandCore = "Unicorn Hair";
				break;
			case "Old Black Glove": wandCore = "Unicorn Hair";
				break;
			case "Golden Key": wandCore = "Phoenix Feather";
				break;
			case "Bound-up Scroll": wandCore = "Phoenix Feather";
				break;
			case "Glittering Jewel": wandCore = "Phoenix Feather";
				break;
			case "Silver Dagger": wandCore = "Dragon Heartstring";
				break;
			case "Ornate Mirror": wandCore = "Dragon Heartstring";
				break;
			default: System.out.println("Error: Artifact");
				break;
			}
		}
		else if (fear == "Isolation")
		{
			switch(artifact)
			{
			case "Dusty Bottle": wandCore = "Unicorn Hair";
				break;
			case "Old Black Glove": wandCore = "Unicorn Hair";
				break;
			case "Golden Key": wandCore = "Unicorn Hair";
				break;
			case "Bound-up Scroll": wandCore = "Unicorn Hair";
				break;
			case "Glittering Jewel": wandCore = "Dragon Heartstring";
				break;
			case "Silver Dagger": wandCore = "Phoenix Feather";
				break;
			case "Ornate Mirror": wandCore = "Dragon Heartstring";
				break;
			default: System.out.println("Error: Artifact");
				break;
			}
		}
		else
		{
			System.out.println("Error: Fear");
		}
	}
	public String returnWandCore()
	{
		return wandCore;
	}
	public void calcWandWood()
	{
		if (path == "Right, towards the castle")
		{
			switch(pride)
			{
			case "Determination":
				switch(eyeColor)
				{
				case "Blue": wandWood = "Beech"; break;
				case "Blue-green": wandWood = "Hawthorn"; break;
				case "Blue-grey": wandWood = "Cedar"; break;
				case "Light Brown": wandWood = "Sycamore"; break;
				case "Brown/Black": wandWood = "Aspen"; break;
				case "Green": wandWood = "Fir"; break;
				case "Grey": wandWood = "Ash"; break;
				case "Hazel": wandWood = "Hazel"; break;
				case "Other": wandWood = "Black Walnut"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Imagination": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Laurel"; break;
				case "Blue-green": wandWood = "Hazel"; break;
				case "Blue-grey": wandWood = "Ebony"; break;
				case "Light Brown": wandWood = "Spruce"; break;
				case "Brown/Black": wandWood = "Alder"; break;
				case "Green": wandWood = "Maple"; break;
				case "Grey": wandWood = "Cedar"; break;
				case "Hazel": wandWood = "Hawthorn"; break;
				case "Other": wandWood = "Aspen"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Intelligence": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Elder"; break;
				case "Blue-green": wandWood = "Pine"; break;
				case "Blue-grey": wandWood = "Sycamore"; break;
				case "Light Brown": wandWood = "Chestnut"; break;
				case "Brown/Black": wandWood = "Black Walnut"; break;
				case "Green": wandWood = "Hazel"; break;
				case "Grey": wandWood = "Ebony"; break;
				case "Hazel": wandWood = "Fir"; break;
				case "Other": wandWood = "Poplar"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Kindness": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Hawthorn"; break;
				case "Blue-green": wandWood = "Spruce"; break;
				case "Blue-grey": wandWood = "Redwood"; break;
				case "Light Brown": wandWood = "Laurel"; break;
				case "Brown/Black": wandWood = "Vine"; break;
				case "Green": wandWood = "Ebony"; break;
				case "Grey": wandWood = "Poplar"; break;
				case "Hazel": wandWood = "Maple"; break;
				case "Other": wandWood = "Blackthorn"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Optimism": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Pine"; break;
				case "Blue-green": wandWood = "Fir"; break;
				case "Blue-grey": wandWood = "Ash"; break;
				case "Light Brown": wandWood = "Elm"; break;
				case "Brown/Black": wandWood = "Hornbeam"; break;
				case "Green": wandWood = "Cedar"; break;
				case "Grey": wandWood = "Black Walnut"; break;
				case "Hazel": wandWood = "Beech"; break;
				case "Other": wandWood = "Walnut"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Originality": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Sycamore"; break;
				case "Blue-green": wandWood = "Alder"; break;
				case "Blue-grey": wandWood = "Elm"; break;
				case "Light Brown": wandWood = "Beech"; break;
				case "Brown/Black": wandWood = "Redwood"; break;
				case "Green": wandWood = "Spruce"; break;
				case "Grey": wandWood = "Maple"; break;
				case "Hazel": wandWood = "Ash"; break;
				case "Other": wandWood = "Cedar"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Resilience": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Walnut"; break;
				case "Blue-green": wandWood = "Redwood"; break;
				case "Blue-grey": wandWood = "Poplar"; break;
				case "Light Brown": wandWood = "Maple"; break;
				case "Brown/Black": wandWood = "Pine"; break;
				case "Green": wandWood = "Black Walnut"; break;
				case "Grey": wandWood = "Spruce"; break;
				case "Hazel": wandWood = "Laurel"; break;
				case "Other": wandWood = "Ebony"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			default: System.out.println("Error: Pride");
			}
		}
		else if (path == "Ahead, towards the forest")
		{
			switch(pride)
			{
			case "Determination":
				switch(eyeColor)
				{
				case "Blue": wandWood = "Cedar"; break;
				case "Blue-green": wandWood = "Cypress"; break;
				case "Blue-grey": wandWood = "Holly"; break;
				case "Light Brown": wandWood = "Yew"; break;
				case "Brown/Black": wandWood = "Ebony"; break;
				case "Green": wandWood = "Walnut"; break;
				case "Grey": wandWood = "Hornbeam"; break;
				case "Hazel": wandWood = "English Oak"; break;
				case "Other": wandWood = "Rowan"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Imagination": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Holly"; break;
				case "Blue-green": wandWood = "Alder"; break;
				case "Blue-grey": wandWood = "Pear"; break;
				case "Light Brown": wandWood = "Cedar"; break;
				case "Brown/Black": wandWood = "English Oak"; break;
				case "Green": wandWood = "Apple"; break;
				case "Grey": wandWood = "Beech"; break;
				case "Hazel": wandWood = "Yew"; break;
				case "Other": wandWood = "Fir"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Intelligence": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Elder"; break;
				case "Blue-green": wandWood = "Pine"; break;
				case "Blue-grey": wandWood = "Sycamore"; break;
				case "Light Brown": wandWood = "Chestnut"; break;
				case "Brown/Black": wandWood = "Black Walnut"; break;
				case "Green": wandWood = "Hazel"; break;
				case "Grey": wandWood = "Ebony"; break;
				case "Hazel": wandWood = "Fir"; break;
				case "Other": wandWood = "Poplar"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Kindness": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "English Oak"; break;
				case "Blue-green": wandWood = "Beech"; break;
				case "Blue-grey": wandWood = "Larch"; break;
				case "Light Brown": wandWood = "Pear"; break;
				case "Brown/Black": wandWood = "Rowan"; break;
				case "Green": wandWood = "Ash"; break;
				case "Grey": wandWood = "Alder"; break;
				case "Hazel": wandWood = "Red Oak"; break;
				case "Other": wandWood = "Cypress"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Optimism": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Rowan"; break;
				case "Blue-green": wandWood = "Cedar"; break;
				case "Blue-grey": wandWood = "Alder"; break;
				case "Light Brown": wandWood = "Apple"; break;
				case "Brown/Black": wandWood = "Spruce"; break;
				case "Green": wandWood = "Beech"; break;
				case "Grey": wandWood = "Dogwood"; break;
				case "Hazel": wandWood = "Pear"; break;
				case "Other": wandWood = "Elm"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Originality": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Fir"; break;
				case "Blue-green": wandWood = "Ash"; break;
				case "Blue-grey": wandWood = "Beech"; break;
				case "Light Brown": wandWood = "Hazel"; break;
				case "Brown/Black": wandWood = "Cedar"; break;
				case "Green": wandWood = "Pine"; break;
				case "Grey": wandWood = "Larch"; break;
				case "Hazel": wandWood = "Sycamore"; break;
				case "Other": wandWood = "Alder"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Resilience": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Yew"; break;
				case "Blue-green": wandWood = "English Oak"; break;
				case "Blue-grey": wandWood = "Cypress"; break;
				case "Light Brown": wandWood = "Rowan"; break;
				case "Brown/Black": wandWood = "Apple"; break;
				case "Green": wandWood = "Holly"; break;
				case "Grey": wandWood = "Fir"; break;
				case "Hazel": wandWood = "Ebony"; break;
				case "Other": wandWood = "Dogwood"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			default: System.out.println("Error: Pride");
			}
		}
		else if (path == "Left, towards the sea")
		{
			switch(pride)
			{
			case "Determination":
				switch(eyeColor)
				{
				case "Blue": wandWood = "Hazel"; break;
				case "Blue-green": wandWood = "Pear"; break;
				case "Blue-grey": wandWood = "Sycamore"; break;
				case "Light Brown": wandWood = "Fir"; break;
				case "Brown/Black": wandWood = "Beech"; break;
				case "Green": wandWood = "Rowan"; break;
				case "Grey": wandWood = "Cypress"; break;
				case "Hazel": wandWood = "Cedar"; break;
				case "Other": wandWood = "Red Oak"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Imagination": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Larch"; break;
				case "Blue-green": wandWood = "Maple"; break;
				case "Blue-grey": wandWood = "Rowan"; break;
				case "Light Brown": wandWood = "Cypress"; break;
				case "Brown/Black": wandWood = "Sycamore"; break;
				case "Green": wandWood = "Hornbeam"; break;
				case "Grey": wandWood = "Silver Lime"; break;
				case "Hazel": wandWood = "Dogwood"; break;
				case "Other": wandWood = "Chestnut"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Intelligence": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Cypress"; break;
				case "Blue-green": wandWood = "Laurel"; break;
				case "Blue-grey": wandWood = "Hawthorn"; break;
				case "Light Brown": wandWood = "RedWood"; break;
				case "Brown/Black": wandWood = "Ash"; break;
				case "Green": wandWood = "Vine"; break;
				case "Grey": wandWood = "Pear"; break;
				case "Hazel": wandWood = "Elm"; break;
				case "Other": wandWood = "Maple"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Kindness": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Willow"; break;
				case "Blue-green": wandWood = "Rowan"; break;
				case "Blue-grey": wandWood = "Pear"; break;
				case "Light Brown": wandWood = "Acacia"; break;
				case "Brown/Black": wandWood = "Silver Lime"; break;
				case "Green": wandWood = "Cypress"; break;
				case "Grey": wandWood = "Red Oak"; break;
				case "Hazel": wandWood = "Cherry"; break;
				case "Other": wandWood = "Larch"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Optimism": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Maple"; break;
				case "Blue-green": wandWood = "Dogwood"; break;
				case "Blue-grey": wandWood = "Hornbeam"; break;
				case "Light Brown": wandWood = "Vine"; break;
				case "Brown/Black": wandWood = "Laurel"; break;
				case "Green": wandWood = "Elm"; break;
				case "Grey": wandWood = "Pine"; break;
				case "Hazel": wandWood = "Redwood"; break;
				case "Other": wandWood = "Ash"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Originality": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Elm"; break;
				case "Blue-green": wandWood = "Larch"; break;
				case "Blue-grey": wandWood = "Cherry"; break;
				case "Light Brown": wandWood = "Pine"; break;
				case "Brown/Black": wandWood = "Acacia"; break;
				case "Green": wandWood = "Beech"; break;
				case "Grey": wandWood = "Hawthorn"; break;
				case "Hazel": wandWood = "Chestnut"; break;
				case "Other": wandWood = "Silver Lime"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			case "Resilience": 
				switch(eyeColor)
				{
				case "Blue": wandWood = "Redwood"; break;
				case "Blue-green": wandWood = "Hornbeam"; break;
				case "Blue-grey": wandWood = "Maple"; break;
				case "Light Brown": wandWood = "Laurel"; break;
				case "Brown/Black": wandWood = "Larch"; break;
				case "Green": wandWood = "Dogwood"; break;
				case "Grey": wandWood = "Elm"; break;
				case "Hazel": wandWood = "Vine"; break;
				case "Other": wandWood = "Pine"; break;
				default: System.out.println("Error: Eye color."); break;
				}
				break;
			default: System.out.println("Error: Pride");
			}
		}
		else
		{
			System.out.println("Error: Path");
		}
	}
	public String returnWandWood()
	{
		return wandWood;
	}
	public void calcWandFlex()
	{
		if (birthDate == "Even")
		{
			switch(pride)
			{
			case "Resilience": wandFlex = "Rigid";
				break;
			case "Intelligence": wandFlex = "Unyielding";
				break;
			case "Determination": wandFlex = "Unbending";
				break;
			case "Originality": wandFlex = "Quite bendy";
				break;
			case "Kindness": wandFlex = "Slightly yielding";
				break;
			case "Optimism": wandFlex = "Solid";
				break;
			case "Imagination": wandFlex = "Surprisingly swishy";
				break;
			default: System.out.println("Error: Pride");
				break;
			}
		}
		else if (birthDate == "Odd")
		{
			switch(pride)
			{
			case "Resilience": wandFlex = "Supple";
				break;
			case "Intelligence": wandFlex = "Hard";
				break;
			case "Determination": wandFlex = "Reasonably supple";
				break;
			case "Originality": wandFlex = "Brittle";
				break;
			case "Kindness": wandFlex = "Quite flexible";
				break;
			case "Optimism": wandFlex = "Pliant";
				break;
			case "Imagination": wandFlex = "Slightly springy";
				break;
			default: System.out.println("Error: Pride");
				break;
			}
		}
		else
		{
			System.out.println("Error: Birth Date");
		}
	}
	public String returnWandFlex()
	{
		return wandFlex;
	}
	public void calcWandLength()
	{
		if (height == "short")
		{
			switch(artifact)
			{
			case "Dusty Bottle": wandLength = 10.5;
				break;
			case "Old Black Glove": wandLength = 9.5;
				break;
			case "Golden Key": wandLength = 11;
				break;
			case "Bound-up Scroll": wandLength = 10;
				break;
			case "Glittering Jewel": wandLength = 9.75;
				break;
			case "Silver Dagger": wandLength = 12.75;
				break;
			case "Ornate Mirror": wandLength = 10.25;
				break;
			default: System.out.println("Error: Artifact");
				break;
			}
		}
		else if (height == "average")
		{
			switch(artifact)
			{
			case "Dusty Bottle": wandLength = 11.25;
				break;
			case "Old Black Glove": wandLength = 12;
				break;
			case "Golden Key": wandLength = 12.25;
				break;
			case "Bound-up Scroll": wandLength = 10.75;
				break;
			case "Glittering Jewel": wandLength = 11.75;
				break;
			case "Silver Dagger": wandLength = 12.5;
				break;
			case "Ornate Mirror": wandLength = 11.5;
				break;
			default: System.out.println("Error: Artifact");
				break;
			}
		}
		else if (height == "tall")
		{
			switch(artifact)
			{
			case "Dusty Bottle": wandLength = 13.5;
				break;
			case "Old Black Glove": wandLength = 14;
				break;
			case "Golden Key": wandLength = 13.75;
				break;
			case "Bound-up Scroll": wandLength = 14.5;
				break;
			case "Glittering Jewel": wandLength = 13.25;
				break;
			case "Silver Dagger": wandLength = 13;
				break;
			case "Ornate Mirror": wandLength = 14.25;
				break;
			default: System.out.println("Error: Artifact");
				break;
			}
		}
		else
		{
			System.out.println("Error: Height");
		}
	}
	public double returnWandLength()
	{
		return wandLength;
	}
	public void printAnswers()
	{
		System.out.print("Height:\t\t" + height +
							"\nEye Color:\t" + eyeColor +
							"\nBirth Day:\t" + birthDate +
							"\nPath:\t\t" + path +
							"\nCharacteristic:\t" + pride +
							"\nFear:\t\t" + fear +
							"\nObject:\t\t" + artifact);
	}
	public void printWand()
	{
		System.out.print(wandWood + " and " + wandCore + ". " + wandLength + " inches. " + wandFlex + ".");
	}
	public void printWandDetails()
	{
		
		System.out.println("Olivander's thoughts on your wand wood and core:");
		System.out.println(wandWood + ":\n");
		
		//System.out.println(wordWrap(wWood.get(wandWood)));
		System.out.println(wWood.get(wandWood));//
		
		System.out.println(wandCore + ":\n");
		//System.out.println(wordWrap(wCore.get(wandCore)));//set in new method
		System.out.println(wCore.get(wandCore));//
		
		System.out.println("Notes on wand length and flexability:");

		//System.out.println(wordWrap(lengthInfo));
		System.out.println(lengthInfo);//
	}
	/*private String wordWrap(String s) //dump into an array, search backward for space?
	{
		char[] ch = new char[s.length()];
		String formatedString = "";
		
		//populate array
		for(int i = 0; i <= s.length(); i++)
		{
			ch[i] = s.charAt(i);
		}
		
		int count = ch.length/100;
		while(count >= 0)
		{
			//search for space
			
			String currentString = ;
			
			//add to existing string
			formatedString  +=  
		}
		
		return formatedString;
	} 
	private int getLastSpace(char[] set)
	{
		boolean done = false;
		for(int i = set.length; i>=0 && !done; i--)
		{
			if(set[i] == ' ')
			{
				done = true;
				return i;
			}
		}
		System.out.println("No spaces in this set.");//only happens at the end
		return 0;
	}*/
	private void popWCore()
	{
		wCore.put("Unicorn Hair","Unicorn hair generally produces the most consistent magic, " +
				"and is least subject to fluctuations and blockages. Wands with unicorn cores are" +
				" generally the most difficult to turn to the Dark Arts. They are the most faithful " +
				"of all wands, and usually remain strongly attached to their first owner, irrespective " +
				"of whether he or she was an accomplished witch or wizard. \n\nMinor disadvantages of " +
				"unicorn hair are that they do not make the most powerful wands (although the wand wood " +
				"may compensate) and that they are prone to melancholy if seriously mishandled, meaning " +
				"that the hair may 'die' and need replacing.");
		wCore.put("Dragon Heartstring","As a rule, dragon heartstrings produce wands with the most power, " +
				"and which are capable of the most flamboyant spells. Dragon wands tend to learn more " +
				"quickly than other types. While they can change allegiance if won from their original " +
				"master, they always bond strongly with the current owner. \n\nThe dragon wand tends to be " +
				"easiest to turn to the Dark Arts, though it will not incline that way of its own accord. " +
				"It is also the most prone of the three cores to accidents, being somewhat temperamental.");
		wCore.put("Phoenix Feather","This is the rarest core type. Phoenix feathers are capable of the greatest " +
				"range of magic, though they may take longer than either unicorn or dragon cores to reveal this. " +
				"They show the most initiative, sometimes acting of their own accord, a quality that many witches " +
				"and wizards dislike.\n\nPhoenix feather wands are always the pickiest when it comes to potential owners, " +
				"for the creature from which they are taken is one of the most independent and detached in the world. " +
				"These wands are the hardest to tame and to personalise, and their allegiance is usually hard won.");
	}
	private void popWWood()
	{
		wWood.put("Acacia","A very unusual wand wood, which I have found creates tricky wands that often refuse to produce magic for any but their owner, and also withhold their best effects from all but those most gifted. This sensitivity renders them difficult to place, and I keep only a small stock for those witches or wizards of sufficient subtlety, for acacia is not suited to what is commonly known as 'bangs-and-smells' magic. When well-matched, an acacia wand matches any for power, though it is often underrated due to the peculiarity of its temperament.");
		wWood.put("Alder","Alder is an unyielding wood, yet I have discovered that its ideal owner is not stubborn or obstinate, but often helpful, considerate and most likeable. Whereas most wand woods seek similarity in the characters of those they will best serve, alder is unusual in that it seems to desire a nature that is, if not precisely opposite to its own, then certainly of a markedly different type. When an alder wand is happily placed, it becomes a magnificent, loyal helpmate. Of all wand types, alder is best suited to non-verbal spell work, whence comes its reputation for being suitable only for the most advanced witches and wizards.");
		wWood.put("Apple","Applewood wands are not made in great numbers. They are powerful and best suited to an owner of high aims and ideals, as this wood mixes poorly with Dark magic. It is said that the possessor of an apple wand will be well-loved and long-lived, and I have often noticed that customers of great personal charm find their perfect match in an applewood wand. An unusual ability to converse with other magical beings in their native tongues is often found among apple wand owners, who include the celebrated author of Merpeople: A Comprehensive Guide to Their Language and Customs, Dylan Marwood.");
		wWood.put("Ash","The ash wand cleaves to its one true master and ought not to be passed on or gifted from the original owner, because it will lose power and skill. This tendency is extreme if the core is of unicorn. Old superstitions regarding wands rarely bear close examination, but I find that the old rhyme regarding rowan, chestnut, ash and hazel wands (rowan gossips, chestnut drones, ash is stubborn, hazel moans) contains a small nugget of truth. Those witches and wizards best suited to ash wands are not, in my experience, lightly swayed from their beliefs or purposes. However, the brash or over-confident witch or wizard, who often insists on trying wands of this prestigious wood, will be disappointed by its effects. The ideal owner may be stubborn, and will certainly be courageous, but never crass or arrogant.");
		wWood.put("Aspen","Wand-quality aspen wood is white and fine-grained, and highly prized by all wand-makers for its stylish resemblance to ivory and its usually outstanding charmwork. The proper owner of the aspen wand is often an accomplished duellist, or destined to be so, for the aspen wand is one of those particularly suited to martial magic. An infamous and secretive eighteenth-century duelling club, which called itself The Silver Spears, was reputed to admit only those who owned aspen wands. In my experience, aspen wand owners are generally strong-minded and determined, more likely than most to be attracted by quests and new orders; this is a wand for revolutionaries.");
		wWood.put("Beech","The true match for a beech wand will be, if young, wise beyond his or her years, and if full-grown, rich in understanding and experience. Beech wands perform very weakly for the narrow-minded and intolerant. Such wizards and witches, having obtained a beech wand without having been suitably matched (yet coveting this most desirable, richly hued and highly prized wand wood), have often presented themselves at the homes of learned wandmakers such as myself, demanding to know the reason for their handsome wand�s lack of power. When properly matched, the beech wand is capable of a subtlety and artistry rarely seen in any other wood, hence its lustrous reputation.");
		wWood.put("Blackthorn","Blackthorn, which is a very unusual wand wood, has the reputation, in my view well-merited, of being best suited to a warrior. This does not necessarily mean that its owner practises the Dark Arts (although it is undeniable that those who do so will enjoy the blackthorn wand�s prodigious power); one finds blackthorn wands among the Aurors as well as among the denizens of Azkaban. It is a curious feature of the blackthorn bush, which sports wicked thorns, that it produces its sweetest berries after the hardest frosts, and the wands made from this wood appear to need to pass through danger or hardship with their owners to become truly bonded. Given this condition, the blackthorn wand will become as loyal and faithful a servant as one could wish.");
		wWood.put("Black Walnut","Less common than the standard walnut wand, that of black walnut seeks a master of good instincts and powerful insight. Black walnut is a very handsome wood, but not the easiest to master. It has one pronounced quirk, which is that it is abnormally attuned to inner conflict, and loses power dramatically if its possessor practises any form of self-deception. If the witch or wizard is unable or unwilling to be honest with themselves or others, the wand often fails to perform adequately and must be matched with a new owner if it is to regain its former prowess. Paired with a sincere, self-aware owner, however, it becomes one of the most loyal and impressive wands of all, with a particular flair in all kinds of charmwork.");
		wWood.put("Cedar","Whenever I meet one who carries a cedar wand, I find strength of character and unusual loyalty. My father, Gervaise Ollivander, used always to say, �you will never fool the cedar carrier,� and I agree: the cedar wand finds its perfect home where there is perspicacity and perception. I would go further than my father, however, in saying that I have never yet met the owner of a cedar wand whom I would care to cross, especially if harm is done to those of whom they are fond. The witch or wizard who is well-matched with cedar carries the potential to be a frightening adversary, which often comes as a shock to those who have thoughtlessly challenged them.");
		wWood.put("Cherry","This very rare wand wood creates a wand of strange power, most highly prized by the wizarding students of the school of Mahoutokoro in Japan, where those who own cherry wands have special prestige. The Western wand-purchaser should dispel from their minds any notion that the pink blossom of the living tree makes for a frivolous or merely ornamental wand, for cherry wood often makes a wand that possesses truly lethal power, whatever the core, but if teamed with dragon heartstring, the wand ought never to be teamed with a wizard without exceptional self-control and strength of mind.");
		wWood.put("Chestnut","This is a most curious, multi-faceted wood, which varies greatly in its character depending on the wand core, and takes a great deal of colour from the personality that possesses it. The wand of chestnut is attracted to witches and wizards who are skilled tamers of magical beasts, those who possess great gifts in Herbology, and those who are natural fliers. However, when paired with dragon heartstring, it may find its best match among those who are overfond of luxury and material things, and less scrupulous than they should be about how they are obtained. Conversely, three successive heads of the Wizengamot have possessed chestnut and unicorn wands, for this combination shows a predilection for those concerned with all manner of justice.");
		wWood.put("Cypress","Cypress wands are associated with nobility. The great medieval wandmaker, Geraint Ollivander, wrote that he was always honoured to match a cypress wand, for he knew he was meeting a witch or wizard who would die a heroic death. Fortunately, in these less blood-thirsty times, the possessors of cypress wands are rarely called upon to lay down their lives, though doubtless many of them would do so if required. Wands of cypress find their soul mates among the brave, the bold and the self-sacrificing: those who are unafraid to confront the shadows in their own and others� natures.");
		wWood.put("Dogwood","Dogwood is one of my own personal favourites, and I have found that matching a dogwood wand with its ideal owner is always entertaining. Dogwood wands are quirky and mischievous; they have playful natures and insist upon partners who can provide them with scope for excitement and fun. It would be quite wrong, however, to deduce from this that dogwood wands are not capable of serious magic when called upon to do so; they have been known to perform outstanding spells under difficult conditions, and when paired with a suitably clever and ingenious witch or wizard, can produce dazzling enchantments. An interesting foible of many dogwood wands is that they refuse to perform non-verbal spells and they are often rather noisy.");
		wWood.put("Ebony","This jet-black wand wood has an impressive appearance and reputation, being highly suited to all manner of combative magic, and to Transfiguration. Ebony is happiest in the hand of those with the courage to be themselves. Frequently non-conformist, highly individual or comfortable with the status of outsider, ebony wand owners have been found both among the ranks of the Order of the Phoenix and among the Death Eaters. In my experience the ebony wand�s perfect match is one who will hold fast to his or her beliefs, no matter what the external pressure, and will not be swayed lightly from their purpose.");
		wWood.put("Elder","The rarest wand wood of all, and reputed to be deeply unlucky, the elder wand is trickier to master than any other. It contains powerful magic, but scorns to remain with any owner who is not the superior of his or her company; it takes a remarkable wizard to keep the elder wand for any length of time. The old superstition, �wand of elder, never prosper,� has its basis in this fear of the wand, but in fact, the superstition is baseless, and those foolish wandmakers who refuse to work with elder do so more because they doubt they will be able to sell their products than from fear of working with this wood. The truth is that only a highly unusual person will find their perfect match in elder, and on the rare occasion when such a pairing occurs, I take it as certain that the witch or wizard in question is marked out for a special destiny. An additional fact that I have unearthed during my long years of study is that the owners of elder wands almost always feel a powerful affinity with those chosen by rowan.");
		wWood.put("Elm","The unfounded belief that only pure-bloods can produce magic from elm wands was undoubtedly started by some elm wand owner seeking to prove his own blood credentials, for I have known perfect matches of elm wands who are Muggle-borns. The truth is that elm wands prefer owners with presence, magical dexterity and a certain native dignity. Of all wand woods, elm, in my experience, produces the fewest accidents, the least foolish errors, and the most elegant charms and spells; these are sophisticated wands, capable of highly advanced magic in the right hands (which, again, makes it highly desirable to those who espouse the pure-blood philosophy).");
		wWood.put("English Oak","A wand for good times and bad, this is a friend as loyal as the wizard who deserves it. Wands of English oak demand partners of strength, courage and fidelity. Less well-known is the propensity for owners of English oak wands to have powerful intuition, and, often, an affinity with the magic of the natural world, with the creatures and plants that are necessary to wizardkind for both magic and pleasure. The oak tree is called King of the Forest from the winter solstice up until the summer solstice, and its wood should only be collected during that time (holly becomes King as the days begin to shorten again, and so holly should only be gathered as the year wanes. This divide is believed to be the origin of the old superstition, �when his wand�s oak and hers is holly, then to marry would be folly,� a superstition that I have found baseless). It is said that Merlin�s wand was of English oak (though his grave has never been found, so this cannot be proven).");
		wWood.put("Fir","My august grandfather, Gerbold Octavius Ollivander, always called wands of this wood �the survivor�s wand,� because he had sold it to three wizards who subsequently passed through mortal peril unscathed. There is no doubt that this wood, coming as it does from the most resilient of trees, produces wands that demand staying power and strength of purpose in their true owners, and that they are poor tools in the hands of the changeable and indecisive. Fir wands are particularly suited to Transfiguration, and favour owners of focused, strong-minded and, occasionally, intimidating demeanour.");
		wWood.put("Hawthorn","The wandmaker Gregorovitch wrote that hawthorn �makes a strange, contradictory wand, as full of paradoxes as the tree that gave it birth, whose leaves and blossoms heal, and yet whose cut branches smell of death.� While I disagree with many of Gregorovitch�s conclusions, we concur about hawthorn wands, which are complex and intriguing in their natures, just like the owners who best suit them. Hawthorn wands may be particularly suited to healing magic, but they are also adept at curses, and I have generally observed that the hawthorn wand seems most at home with a conflicted nature, or with a witch or wizard passing through a period of turmoil. Hawthorn is not easy to master, however, and I would only ever consider placing a hawthorn wand in the hands of a witch or wizard of proven talent, or the consequences might be dangerous. Hawthorn wands have a notable peculiarity: their spells can, when badly handled, backfire.");
		wWood.put("Hazel","A sensitive wand, hazel often reflects its owner�s emotional state, and works best for a master who understands and can manage their own feelings. Others should be very careful handling a hazel wand if its owner has recently lost their temper, or suffered a serious disappointment, because the wand will absorb such energy and discharge it unpredictably. The positive aspect of a hazel wand more than makes up for such minor discomforts, however, for it is capable of outstanding magic in the hands of the skillful, and is so devoted to its owner that it often �wilts� (which is to say, it expels all its magic and refuses to perform, often necessitating the extraction of the core and its insertion into another casing, if the wand is still required) at the end of its master�s life (if the core is unicorn hair, however, there is no hope; the wand will almost certainly have �died�). Hazel wands also have the unique ability to detect water underground, and will emit silvery, tear-shaped puffs of smoke if passing over concealed springs and wells.");
		wWood.put("Holly","Holly is one of the rarer kinds of wand woods; traditionally considered protective, it works most happily for those who may need help overcoming a tendency to anger and impetuosity. At the same time, holly wands often choose owners who are engaged in some dangerous and often spiritual quest. Holly is one of those woods that varies most dramatically in performance depending on the wand core, and it is a notoriously difficult wood to team with phoenix feather, as the wood's volatility conflicts strangely with the phoenix's detachment. In the unusual event of such a pairing finding its ideal match, however, nothing and nobody should stand in their way.");
		wWood.put("Hornbeam","My own wand is made of hornbeam, and so it is with all due modesty that I state that hornbeam selects for its life mate the talented witch or wizard with a single, pure passion, which some might call obsession (though I prefer the term �vision�), which will almost always be realised. Hornbeam wands adapt more quickly than almost any other to their owner�s style of magic, and will become so personalised, so quickly, that other people will find them extremely difficult to use even for the most simple of spells. Hornbeam wands likewise absorb their owner�s code of honour, whatever that might be, and will refuse to perform acts - whether for good or ill - that do not tally with their master�s principles. A particularly fine-tuned and sentient wand.");
		wWood.put("Larch","Strong, durable and warm in colour, larch has long been valued as an attractive and powerful wand wood. Its reputation for instilling courage and confidence in the user has ensured that demand has always outstripped supply. This much sought-after wand is, however, hard to please in the matter of ideal owners, and trickier to handle than many imagine. I find that it always creates wands of hidden talents and unexpected effects, which likewise describes the master who deserves it. It is often the case that the witch or wizard who belongs to the larch wand may never realise the full extent of their considerable talents until paired with it, but that they will then make an exceptional match.");
		wWood.put("Laurel","It is said that a laurel wand cannot perform a dishonourable act, although in the quest for glory (a not uncommon goal for those best suited to these wands), I have known laurel wands perform powerful and sometimes lethal magic. Laurel wands are sometimes called fickle, but this is unfair. The laurel wand seems unable to tolerate laziness in a possessor, and it is in such conditions that it is most easily and willingly won away. Otherwise, it will cleave happily to its first match forever, and indeed has the unusual and engaging attribute of issuing a spontaneous lightning strike if another witch or wizard attempts to steal it.");
		wWood.put("Maple","I have often found that those chosen by maple wands are by nature travellers and explorers; they are not stay-at-home wands, and prefer ambition in their witch or wizard, otherwise their magic grows heavy and lacklustre. Fresh challenges and regular changes of scene cause this wand to literally shine, burnishing itself as it grows, with its partner, in ability and status. This is a beautiful and desirable wood, and wand quality maple has been among the most costly for centuries. Possession of a maple wand has long been a mark of status, because of its reputation as the wand of high achievers.");
		wWood.put("Pear","This golden-toned wood produces wands of splendid magical powers, which give of their best in the hands of the warm-hearted, the generous and the wise. Possessors of pear wands are, in my experience, usually popular and well-respected. I do not know of a single instance where a pear wand has been discovered in the possession of a Dark witch or wizard. Pear wands are among the most resilient, and I have often observed that they may still present a remarkable appearance of newness, even after many years of hard use.");
		wWood.put("Pine","The straight-grained pine wand always chooses an independent, individual master who may be perceived as a loner, intriguing and perhaps mysterious. Pine wands enjoy being used creatively, and unlike some others, will adapt unprotestingly to new methods and spells. Many wandmakers insist that pine wands are able to detect, and perform best for, owners who are destined for long lives, and I can confirm this in as much as I have never personally known the master of a pine wand to die young. The pine wand is one of those that is most sensitive to non-verbal magic.");
		wWood.put("Poplar","�If you seek integrity, search first among the poplars,� was a great maxim of my grandfather, Gerbold Ollivander, and my own experience of poplar wands and their owners tallies exactly with his. Here is a wand to rely upon, of consistency, strength and uniform power, always happiest when working with a witch or wizard of clear moral vision. There is a tired old joke among lesser wandmakers that no poplar wand has ever chosen a politician, but here they show their lamentable ignorance: two of the Ministry�s most accomplished Ministers for Magic, Eldritch Diggory and Evangeline Orpington, were the possessors of fine, Ollivander-made poplar wands.");
		wWood.put("Red Oak","You will often hear the ignorant say that red oak is an infallible sign of its owner�s hot temper. In fact, the true match for a red oak wand is possessed of unusually fast reactions, making it a perfect duelling wand. Less common than English oak, I have found that its ideal master is light of touch, quick-witted and adaptable, often the creator of distinctive, trademark spells, and a good man or woman to have beside one in a fight. Red oak wands are, in my opinion, among the most handsome.");
		wWood.put("Redwood","Wand-quality redwood is in short supply, yet constant demand, due to its reputation for bringing good fortune to its owner. As is usually the case with wandlore, the general populace have the truth back to front: redwood wands are not themselves lucky, but are strongly attracted to witches and wizards who already possess the admirable ability to fall on their feet, to make the right choice, to snatch advantage from catastrophe. The combination of such a witch or wizard with a redwood wand is always intriguing, and I generally expect to hear of exciting exploits when I send this special pairing out from my workshop.");
		wWood.put("Rowan","Rowan wood has always been much-favoured for wands, because it is reputed to be more protective than any other, and in my experience renders all manner of defensive charms especially strong and difficult to break. It is commonly stated that no Dark witch or wizard ever owned a rowan wand, and I cannot recall a single instance where one of my own rowan wands has gone on to do evil in the world. Rowan is most happily placed with the clear-headed and the pure-hearted, but this reputation for virtue ought not to fool anyone - these wands are the equal of any, often the better, and frequently out-perform others in duels.");
		wWood.put("Silver Lime","This unusual and highly attractive wand wood was greatly in vogue in the nineteenth century. Demand outstripped supply, and unscrupulous wandmakers dyed substandard woods in an effort to fool purchasers into believing that they had purchased silver lime. The reasons for these wands� desirability lay not only in their unusually handsome appearance, but also because they had a reputation for performing best for Seers and those skilled in Legilimency, mysterious arts both, which consequently gave the possessor of a silver lime wand considerable status. When demand was at its height, wandmaker Arturo Cephalopos claimed that the association between silver lime and clairvoyance was �a falsehood circulated by merchants like Gerbold Ollivander (my own grandfather), who have overstocked their workshops with silver lime and hope to shift their surplus.� But Cephalopos was a slipshod wandmaker and an ignoramus, and nobody, Seer or not, was surprised when he went out of business.");
		wWood.put("Spruce","Unskilled wandmakers call spruce a difficult wood, but in doing so they reveal their own ineptitude. It is quite true that it requires particular deftness to work with spruce, which produces wands that are ill-matched with cautious or nervous natures, and become positively dangerous in fumbling fingers. The spruce wand requires a firm hand, because it often appears to have its own ideas about what magic it ought to be called upon to produce. However, when a spruce wand meets its match - which, in my experience, is a bold spell-caster with a good sense of humour - it becomes a superb helper, intensely loyal to their owners and capable of producing particularly flamboyant and dramatic effects.");
		wWood.put("Sycamore","The sycamore makes a questing wand, eager for new experience and losing brilliance if engaged in mundane activities. It is a quirk of these handsome wands that they may combust if allowed to become �bored,� and many witches and wizards, settling down into middle age, are disconcerted to find their trusty wand bursting into flame in their hand as they ask it, one more time, to fetch their slippers. As may be deduced, the sycamore�s ideal owner is curious, vital and adventurous, and when paired with such an owner, it demonstrates a capacity to learn and adapt that earns it a rightful place among the world's most highly-prized wand woods.");
		wWood.put("Vine","The druids considered anything with a woody stem as a tree, and vine makes wands of such a special nature that I have been happy to continue their ancient tradition. Vine wands are among the less common types, and I have been intrigued to notice that their owners are nearly always those witches or wizards who seek a greater purpose, who have a vision beyond the ordinary and who frequently astound those who think they know them best. Vine wands seem strongly attracted by personalities with hidden depths, and I have found them more sensitive than any other when it comes to instantly detecting a prospective match. Reliable sources claim that these wands can emit magical effects upon the mere entrance into their room of a suitable owner, and I have twice observed the phenomenon in my own shop.");
		wWood.put("Walnut","Highly intelligent witches and wizards ought to be offered a walnut wand for trial first, because in nine cases out of ten, the two will find in each other their ideal mate. Walnut wands are often found in the hands of magical innovators and inventors; this is a handsome wood possessed of unusual versatility and adaptability. A note of caution, however: while some woods are difficult to dominate, and may resist the performance of spells that are foreign to their natures, the walnut wand will, once subjugated, perform any task its owner desires, provided that the user is of sufficient brilliance. This makes for a truly lethal weapon in the hands of a witch or wizard of no conscience, for the wand and the wizard may feed from each other in a particularly unhealthy manner.");
		wWood.put("Willow","Willow is an uncommon wand wood with healing power, and I have noted that the ideal owner for a willow wand often has some (usually unwarranted) insecurity, however well they may try and hide it. While many confident customers insist on trying a willow wand (attracted by their handsome appearance and well-founded reputation for enabling advanced, non-verbal magic) my willow wands have consistently selected those of greatest potential, rather than those who feel they have little to learn. It has always been a proverb in my family that he who has furthest to travel will go fastest with willow.");
		wWood.put("Yew","Yew wands are among the rarer kinds, and their ideal matches are likewise unusual, and occasionally notorious. The wand of yew is reputed to endow its possessor with the power of life and death, which might, of course, be said of all wands; and yet yew retains a particularly dark and fearsome reputation in the spheres of duelling and all curses. However, it is untrue to say (as those unlearned in wandlore often do) that those who use yew wands are more likely to be attracted to the Dark Arts than another. The witch or wizard best suited to a yew wand might equally prove a fierce protector of others. Wands hewn from these most long-lived trees have been found in the possession of heroes quite as often as of villains. Where wizards have been buried with wands of yew, the wand generally sprouts into a tree guarding the dead owner�s grave. What is certain, in my experience, is that the yew wand never chooses either a mediocre or a timid owner.");
	}
}
