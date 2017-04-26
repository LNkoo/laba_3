package LNk.oop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lena on 25.04.2017.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "info",method = RequestMethod.GET)
    public String helloOne(){
        return "index.html";
    }
    @RequestMapping ("/hello")
    public String  hello(){

        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title>Титульна сторінка</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<style>\n" +
                "\tbody {\n" +
                "\t\tpadding: 75px;\n" +
                "\t}\n" +
                "\t.fors {\n" +
                "\t\tfont-size: 12px;\n" +
                "\t\ttext-align: right;\n" + // Форма № Н-6.01
                "\t\tfont-weight: 700;\n" +
                "\t\t\n" +
                "\t\t}\n" +
                "\t.for {\n" +
                "\t\tfont-size: 12px;\n" +
                "\t\ttext-align: right;\n" + // ЗАТВЕРДЖЕНО
                "\t\tmargin-right: 130px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.fort {\n" +
                "\t\tfont-size: 12px;\n" +
                "\t\ttext-align: right;\n" + // Наказ Міністерства освіти і науки
                "\t\tmargin-right: 45px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.firt {\n" +
                "\t\tfont-size: 12px;\n" +
                "\t\ttext-align: right;\n" + // 29 березня 2012 року № 384
                "\t\tmargin-right: 30px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.sec {\n" +
                "\t\tfont-size: 18px;\n" +
                "\t\ttext-align: center;\n" + //Інститут фізико-технічних та комп’ютерних наук
                "\t\tpadding-left: 10px;\n"+ //Відділ комп’ютерних технологій
                "\t\tpadding-right: 10px;\n" + //Кафедра програмного забезпечення комп’ютерних систем
                "\t\t\n" +
                "\t\t}\n" +
                "\t.first {\n" +
                "\t\tfont-size: 14px;\n" +
                "\t\ttext-align: center;\n" +
                "\t\tpadding-left: 200px;\n"+  //КУРСОВИЙ ПРОЕКТ
                "\t\tpadding-right: 200px;\n" +
                "\t\t\n" +
                "\t\t}\n" +
                "\t.mini {\n" +
                "\t\tpadding-top: 20px;\n" +
                "\t\ttext-align: center;\n" + //з предмету
                "\t\tpadding-left: 30px;\n" +
                "\t}\n" +
                "\t.title {\n" +
                "\t\t\n" +
                "\t\tfont-size: 20px;\n" +
                "\t\tfont-weight: 700;\n" +
                "\t\ttext-align: center;\n" + //Об'єкто-орієнтоване програмування
                "\t\tpadding-left: 200px;\n" +
                "\t\tpadding-right: 200px;\n" +
                "\t\t\n" +
                "\t\t}\n" +
                "\t.second {\n" +
                "\t\tfont-size: 18px;\n" +
                "\t\ttext-align: right;\n" + // Студентки 2 курсу 243 групи
                "\t\tmargin-right: 95px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.third {\n" +
                "\t\tfont-size: 18px;\n" +
                "\t\ttext-align: right;\n" + // напряму підготовки
                "\t\tmargin-right: 160px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.fif {\n" +
                "\t\tfont-size: 18px;\n" +
                "\t\ttext-align: right;\n" + // «Програмна інженерія»
                "\t\tmargin-right: 135px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.fifth {\n" +
                "\t\tfont-size: 18px;\n" +
                "\t\ttext-align: right;\n" + // Зозулі О.М.
                "\t\tmargin-right: 225px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.six {\n" +
                "\t\tfont-size: 18px;\n" +
                "\t\ttext-align: right;\n" + // Керівник
                "\t\tmargin-right: 245px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.sixs {\n" +
                "\t\tfont-size: 18px;\n" +
                "\t\ttext-align: right;\n" + // Доцент кафедри ПЗКС
                "\t\tmargin-right: 140px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.sixst {\n" +
                "\t\tfont-size: 18px;\n" +
                "\t\ttext-align: right;\n" + // Прохоров Г.В.
                "\t\tmargin-right: 205px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.sev {\n" +
                "\t\tfont-size: 12px;\n" +
                "\t\ttext-align: right;\n" + // Національна шкала ________________
                "\t\tmargin-right: 120px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.seven {\n" +
                "\t\tfont-size: 12px;\n" +
                "\t\ttext-align: right;\n" + // Кількість балів: __________Оцінка:  ECTS _____
                "\t\tmargin-right: 70px;\n"+
                "\t\tpadding-left: 320px;\n" +
                "\t}\n" +
                "\t.eight {\n" +
                "\t\tfont-size: 18px;\n" +
                "\t\ttext-align:right;\n" + // Члени комісії ________________  ___________________________
                "\t\tfont-weight: 700;\n" +
               "\t\tmargin-right: 65px;\n"+
                "\t\t\n" +
                "\t\t}\n" +
                "\t.nin {\n" +
                "\t\tfont-size: 12px;\n" +
                "\t\ttext-align:right;\n" + // (підпис)        (прізвище та ініціали
                ".surn{" +
                "margin-right: 300px;}\n" +
                ".check{" +
                "margin-right: 100px;}\n"+
                "</style>\n" +
                "\n" +
                "<div class=\"fors\">Форма № Н-6.01</div>\n" +
                "<div class=\"for\">ЗАТВЕРДЖЕНО</div>\n" +
                "<div class=\"fort\">Наказ Міністерства освіти і науки</div>\n" +
                "<div class=\"firt\">29 березня 2012 року № 384</div>\n" +
                "<br/></br/>\n"+
                "<div class=\"sec\">Інститут фізико-технічних та комп’ютерних наук</div>\n" +
                "<div class=\"sec\">Відділ комп’ютерних технологій</div>\n" +
                "<div class=\"sec\">Кафедра програмного забезпечення комп’ютерних систем</div>\n" +
                "<br/></br/>\n"+
                "<br/></br/>\n"+
                "<br/></br/>\n"+
                "<div class=\"first\">КУРСОВИЙ ПРОЕКТ</div>\n" +
                "<div class=\"mini\">з предмету</div>\n" +
                "<div class=\"title\">Об'єкто-орієнтоване \n" +
                "програмування</div>\n" +
                "<br/></br/>\n"+
                "<br/></br/>\n"+
                "<div class=\"second\">Студентки 2 курсу 243 групи</div>\n" +
                "<div class=\"third\">напряму підготовки </div>\n" +
                "<div class=\"fif\">«Програмна інженерія»</div>\n" +
                "<div class=\"fifth\">Зозулі О.М.</div>\n" +
                "<br/></br/>\n"+
                "<div class=\"six\">Керівник </div>\n" +
                "<div class=\"sixs\">Доцент кафедри ПЗКС </div>\n" +
                "<div class=\"sixst\">Прохоров Г.В. </div>\n" +
                "<br/></br/>\n"+
                "<div class=\"sev\">Національна шкала ________________  </div>\n" +
                "<div class=\"seven\">Кількість балів: __________Оцінка:  ECTS _____  </div>\n" +
                "<br/></br/>\n"+
                "<br/></br/>\n"+
                "<div class=\"eight\">Члени комісії ________________   ____________________</div>\n" +
                "<div class=\"nin\" style=\"overflow: hidden;\"><div style=\"margin-right: 100px;float: left;margin-left: 300px;\">(підпис) </div><div  style=\"margin-right: 100px;float: left;\"> (прізвище та ініціали)</div></div>\n" +
                "<div>\n" +
                "\t<div>\n" +
                "\t\t<div></div>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>";




    }

}
