class Metrica {
    
    public float getOdds (float p, float t, float f) {
        return (p * (f / t)/((1 - p) * (f / t)));
    }
    
}   



