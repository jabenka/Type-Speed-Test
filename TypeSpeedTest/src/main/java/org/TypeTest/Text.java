package org.TypeTest;

public class Text {
    int Difficulty;
    Text(int Difficulty) {
        this.Difficulty = Difficulty;
    }
    public String getEasy(){
        return "I went to the park and saw a tree, it was a big tree and it was very green. I could see a red apple on a high branch so I reached up and picked it off. " +
                "It was weird how I picked it off, as I am very short. I suppose I just jumped really high.";
    }
    public String getMedium(){
        return "In a crowded tech conference, a young entrepreneur named Alex had just 10 minutes to pitch his startup to a panel of investors. " +
                "With 5 slides and a nervous smile, he explained how his app could streamline supply chains, saving companies up to 20% in logistics costs. " +
                "The investors were captivated. A week later, Alex secured $1 million in seed funding, proving the power of a concise and impactful pitch.";
    }
    public String getHard(){
        return "Typists often handle confidential documents. Treat sensitive information with the utmost care. " +
                "Follow company policies regarding data security and privacy. Securely store or destroy confidential documents as instructed.";
    }
    public String getImpossible(){
        return "Tx (treatment); HAART (highly active antiretroviral therapy); FDA (Food and Drug Administration); CAP (cancer of the prostate); OTC (over-the-counter); " +
                "SSI (Sliding scale insulin); N/A (not applicable); Mg (magnesium); " +
                "PA (physician assistant); liq. (liquid); instill. (instillation); CF (cystic fibrosis); SOB (shortness of breath)";
    }
}
