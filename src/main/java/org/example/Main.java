package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        // Saatin geçerli olup olmadığını kontrol et
        if (clock < 0 || clock > 23) {
            return false;
        }

        // Eğer köpek havlıyorsa ve saat 20:00 ile 8:00 arasındaysa true dön
        if (isBarking && (clock < 8 || clock >= 20)) {
            return true;
        }

        // Diğer tüm durumlar için false dön
        return false;
    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        // Eğer herhangi bir parametre 13 ile 19 arasındaysa true dön
        if ((firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19)) {
            return true;
        }
        // Diğer durumlarda false dön
        return false;
    }


    public static boolean isCatPlaying(boolean isSummer, int temp) {
        // Eğer yaz mevsimiyse üst limit 45 olacak
        int upperLimit = isSummer ? 45 : 35;

        // Sıcaklık 25 ile upperLimit arasında ise kedi oyun oynuyor
        if (temp >= 25 && temp <= upperLimit) {
            return true;
        }

        // Diğer durumlarda kedi oyun oynamıyor
        return false;
    }


    public static double area(double width, double height) {
        // Negatif kontrolü
        if (width < 0 || height < 0) {
            return -1;
        }
        // Alan hesaplama
        return width * height;
    }


    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        // Alan hesaplama: πr²
        return radius * radius * Math.PI;
    }
}

/*commit sorun */
