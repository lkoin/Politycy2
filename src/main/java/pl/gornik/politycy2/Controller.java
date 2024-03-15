package pl.gornik.politycy2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private RadioButton AR;

    @FXML
    private ToggleGroup kandydacji;

    @FXML
    private RadioButton MZ;

    @FXML
    private RadioButton WS;

    @FXML
    private RadioButton BK;

    @FXML
    private RadioButton DB;

    @FXML
    private RadioButton DS;

    @FXML
    private RadioButton MC;

    @FXML
    private RadioButton RR;

    @FXML
    private Button btnClose;

    @FXML
    private ImageView imgView;

    @FXML
    private Label lblInfo;

    private String[] pathImg ={"/Files/AdamRebisz.jpg",
            "/Files/MarianZiolo.jpg",
            "/Files/WaldemarSzwedo.jpg",
            "/Files/BozenaKapusciak.jpg",
            "/Files/DariuszBozek.jpg",
            "/Files/DamianSzwagierczak.jpg",
            "/Files/MarianCapałą.jpg",
            "/Files/RobertRebisz.jpg",
            };

    private String[] description = {
            "Urodzony w 1980 r. " +
                    "Nauczyciel w Szkole Podstawowej nr 10 w Tarnobrzegu.\n" +
                    "Kandydat z ramienia KWW Dariusza Bożka Razem Dla Tarnobrzega. \n" +
                    "Startuje w okręgu 1 (Osiedle Serbinów) na miejscu 2. ",
            "Urodzony w 1950. Radny Prawa i Sprawiedliwości.\n" +
                    "Członek Komisji Rewizyjnej i Komisji Oświaty, Kultury i Sportu.\n" +
                    "Przedsiębiorca.\n" +
                    "Kandydat w okręgu 4 (Osiedle Piastów) na miejscu 2. ",
            "Urodzony 17 marca 1961 roku w Trześni.\n" +
                    "Absolwent Politechniki Warszawskiej. \n" +
                    "Nauczyciel w tarnobrzeskim „Górniku”.\n" +
                    "Radny Rady Miasta Tarnobrzega VII i VIII kadencji.",
            "Absolwentka Akademii Pedagogicznej w Krakowie. \n" +
                    "Doświadczony samorządowiec, była dyrektor Szkoły Podstawowej nr 11 oraz Zespołu Kolegiów Nauczycielskich w Tarnobrzegu. \n" +
                    "Wiceprzewodnicząca Rady Miasta Tarnobrzega. Przewodnicząca Zarządu Osiedla Dzików. ",
            "Urodzony 14 października 1960 w Tarnobrzegu.\n" +
                    "Polski nauczyciel i samorządowiec. W latach 2017–2018 przewodniczący tarnobrzeskiej Rady Miasta, od 2018 prezydent Tarnobrzega.\n" +
                    "Absolwent Wydziału Historyczno-Filozoficznego Uniwersytetu Jagiellońskiego. ",
            "Urodzony 13 kwietnia 1974 roku w Tarnobrzegu.\n" +
                    "Jest absolwentem kierunku pedagogicznego na Uniwersytecie Rzeszowskim.\n" +
                    "Pracował w firmie Stichting Halimie.\n" +
                    "Dyrektor Domu Dziecka w Skopaniu," ,
            "Urodzony w 1958 r. \n" +
                    "Kandydat Prawa i Sprawiedliwości w okręgu 2 (Osiedle Dzików, Osiedle Przywiśle) na miejscu 1.\n" +
                    "Zastępca dyrektora Tarnobrzeskiej Specjalnej Strefy Ekonomicznej EURO-PARK WISŁOSAN.",
            "Urodzony w 1976 r. Były kierownik targowiska.\n" +
                    "W listopadzie 2014 r. startował z listy Prawa i Sprawiedliwości.\n" +
                    "Zdobył wówczas 133 głosy, najwięcej zaraz po Kamilu Kalince,\n" +
                    "którego poparło 468 wyborców oraz radnej Barbarze Kłeczek,"
    };
    private Image image;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnClose.setOnAction(event -> Platform.exit());
        setImgAndTxt(0);
        MZ.setOnAction(event -> setImgAndTxt(1));
        WS.setOnAction(event -> setImgAndTxt(2));
        BK.setOnAction(event -> setImgAndTxt(3));
        DB.setOnAction(event -> setImgAndTxt(4));
        DS.setOnAction(event -> setImgAndTxt(5));
        MC.setOnAction(event -> setImgAndTxt(6));
        RR.setOnAction(event -> setImgAndTxt(7));
    }

    public void setImgAndTxt(int index) {
        image = new Image(String.valueOf(getClass().getResource(pathImg[index])));
        imgView.setImage(image);
        lblInfo.setText(description[index]);
    }
}
