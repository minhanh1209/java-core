package REDBOXENTERTAINMENT.customer;

import REDBOXENTERTAINMENT.movie.CompactDiscMovie;
import REDBOXENTERTAINMENT.music.CompactDiscMusic;

import java.util.Scanner;

public class CDCreator {
    int nextMovie = 0;
    int maxMovie = 3;
    int nextAlbum = 0;
    int maxAlbum = 3;
    CompactDiscMovie[] vcd = new CompactDiscMovie[maxMovie];
    CompactDiscMusic[] cd = new CompactDiscMusic[maxAlbum];

    public CDCreator() {

    }


    public void displayALLMusic() {
        for (int i = 0; i < cd.length; i++) {
            if (cd[i] == null) {
                break;
            } else {
                System.out.println(cd[i].toString());
            }
        }
    }

    public void displayALLMovie() {
        for (int i = 1; i <= cd.length; i++) {
            if (cd[i] == null) {
                break;
            } else {
                System.out.println(vcd[i].toString());
            }
        }
    }

    public boolean addMusicCD() {
        if (maxAlbum > nextAlbum) {
            return true;
        }
        return false;
    }

    public boolean addMovieCD() {
        if (maxMovie > nextMovie) {
            return true;
        }
        return false;
    }

    public void nhapMusic() {
        CompactDiscMusic music = new CompactDiscMusic();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten dia: ");
        music.setTenDia(sc.nextLine());
        System.out.print("Nhap ten nghe si: ");
        music.setNgheSi(sc.nextLine());
        System.out.print("NHap ma dia: ");
        music.setMa(sc.nextLine());
        System.out.print("Nhap gia dia: ");
        music.setGia(sc.nextInt());
        System.out.println("Nhap thong tin thanh cong");
        cd[nextAlbum] = music;
        nextAlbum++;
    }

    public void nhapMovie() {
        CompactDiscMovie movie = new CompactDiscMovie();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten dia: ");
        movie.setTenDia(sc.nextLine());
        System.out.print("NHap ma dia: ");
        movie.setMa(sc.nextLine());
        System.out.print("Nhap gia dia: ");
        movie.setGia(sc.nextInt());
        System.out.println("Nhap thong tin thanh cong");
        vcd[nextMovie] = movie;
        nextMovie++;
    }

}
