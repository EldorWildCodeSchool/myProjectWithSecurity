package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String index(){

        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Page Title</title>\n" +
                "<style>\n" +
                "@import url('http://fonts.cdnfonts.com/css/the-mighty-avengers');\n" +
                ".header-grow {\n" +
                "    font-family: 'The Mighty Avengers', \n" +
                "    sans-serif;\n" +
                "    animation: growth 3s;\n" +
                "    animation-fill-mode: backwards;\n" +
                "    font-size: 10rem;\n" +
                "  }\n" +
                "  @keyframes growth {\n" +
                "    0% {\n" +
                "      font-size: 0;\n" +
                "    }\n" +
                "    100% {\n" +
                "      font-size: 10rem;\n" +
                "    }\n" +
                "  }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<center>\n" +
                "    <br><br><h1 class=\"header-grow\">Welcome to the shield</h1>\n" +
                "<br>\n" +
                "<form method=\"get\" action=\"/avengers/assemble\">\n" +
                "  <button type=\"submit\">Avengers</button>\n" +
                "</form>\n" +
                "<form method=\"get\" action=\"/secret-bases\">\n" +
                "  <button type=\"submit\">Directors</button>\n" +
                "</form>\n" +
                "<form method=\"get\" action=\"/logout\">\n" +
                "  <button type=\"submit\">Logout</button>\n" +
                "</form>\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>";

        return html;

    }

    @GetMapping("/avengers/assemble")
    public String hero() {

        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Page Title</title>\n" +
                "<style>\n" +
                "@import url('http://fonts.cdnfonts.com/css/the-mighty-avengers');\n" +
                ".header-grow {\n" +
                "    font-family: 'The Mighty Avengers', \n" +
                "    sans-serif;\n" +
                "    animation: growth 3s;\n" +
                "    animation-fill-mode: backwards;\n" +
                "    font-size: 10rem;\n" +
                "  }\n" +
                "  @keyframes growth {\n" +
                "    0% {\n" +
                "      font-size: 0;\n" +
                "    }\n" +
                "    100% {\n" +
                "      font-size: 10rem;\n" +
                "    }\n" +
                "  }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<center>\n" +
                "    <h1 class=\"header-grow\">Avengers ... Assemble!</h1>\n" +
                "<br>\n" +
                "<form method=\"get\" action=\"/avengers/assemble\">\n" +
                "  <button type=\"submit\">Avengers</button>\n" +
                "</form>\n" +
                "<form method=\"get\" action=\"/secret-bases\">\n" +
                "  <button type=\"submit\">Directors</button>\n" +
                "</form>\n" +
                "<form method=\"get\" action=\"/\">\n" +
                "  <button type=\"submit\">Index</button>\n" +
                "</form>\n" +
                "<form method=\"get\" action=\"/logout\">\n" +
                "  <button type=\"submit\">Logout</button>\n" +
                "</form>\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>";

        return html;
    }

    @GetMapping("/secret-bases")
    public String director() {

        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>S.H.I.E.L.D</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<h1>Informations for SHIELD directors only</h1>\n" +
                "<h2>Frankreich</h2>\n" +
                "<p>Biarritz</p>\n" +
                "<p>Bordeaux</p>\n" +
                "<p>Die Lupe</p>\n" +
                "<p>Lille</p>\n" +
                "<p>Lyon</p>\n" +
                "<p>Marseille</p>\n" +
                "<p>Nantes</p>\n" +
                "<p>Orleans</p>\n" +
                "<p>Paris</p>\n" +
                "<p>Reims</p>\n" +
                "<p>Straßburg</p>\n" +
                "<p>Toulouse</p>\n" +
                "<p>Türme</p>\n" +
                "<br>\n" +
                "<h2>Europa</h2>\n" +
                "<p>Amsterdam</p>\n" +
                "<p>Barcelona</p>\n" +
                "<p>Berlin</p>\n" +
                "<p>Brüssel</p>\n" +
                "<p>Bukarest</p>\n" +
                "<p>Lissabon</p>\n" +
                "<p>London</p>\n" +
                "<p>Madrid</p>\n" +
                "\n" +
                "<form method=\"get\" action=\"/avengers/assemble\">\n" +
                "  <button type=\"submit\">Avengers</button>\n" +
                "</form>\n" +
                "<form method=\"get\" action=\"/secret-bases\">\n" +
                "  <button type=\"submit\">Directors</button>\n" +
                "</form>\n" +
                "<form method=\"get\" action=\"/\">\n" +
                "  <button type=\"submit\">Index</button>\n" +
                "</form>\n" +
                "<form method=\"get\" action=\"/logout\">\n" +
                "  <button type=\"submit\">Logout</button>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";

        return html ;
    }

}
