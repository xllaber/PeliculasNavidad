class Metrica {

    public float getOdds (float p, float t, float f) {
        return (p * (f / t)/((p + 1) * (f / t)));
    }
    
}   



