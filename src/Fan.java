public class Fan {
    int bladeCount; // -количество лопостей
    int mode = 1; // номер режима [1 -maxMode]
    int maxMode; // количество допустимых режимов
    int potreblenieElektroenergii;
    int oborotovVMinutu;; // 1500 + 500*mode


    public Fan(int potreblenieElektroenergii, int maxMode, int bladeCount) {
        if (bladeCount > 0){
            this.bladeCount = bladeCount;
        }else{
            throw new RuntimeException("bladeCount should be >0, current value =" + bladeCount);
        }
        this.bladeCount = bladeCount;
        this.maxMode = maxMode;
        this.potreblenieElektroenergii = potreblenieElektroenergii;
    }

    public void modeUp(){
        mode  = mode % maxMode + 1;
        oborotovVMinutu = 1500 + 500 * mode;
    }
    public void modeDown(){
        if (mode == 1) {
            mode = maxMode;
        }else{
            mode--;
        }
        oborotovVMinutu = 1500 + 500 * mode;
    }

}
