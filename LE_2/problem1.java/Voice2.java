class Voice2 {
    // Template method to enforce the sequence
    public void templateMethod() {
        prepareVoice(); // This step must come first
        hear();          // This step must come after preparing the voice
    }
    
    // Step 1: Prepare the voice
    private void prepareVoice() {
        System.out.println("Preparing voice...");
    }
    
    // Step 2: Hear the voice
    private void hear() {
        System.out.println("Hearing the voice...");
    }
}
