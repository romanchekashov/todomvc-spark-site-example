package ru.besttuts.spark;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;
import static spark.Spark.threadPool;

/**
 * @author romanchekashov
 * @since 07.03.2016
 */
public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");
        threadPool(8);

        get("/", (req, res) -> {
            Map map = new HashMap<>();
            map.put("title", "React • TodoMVC");

            return new ModelAndView(map, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
