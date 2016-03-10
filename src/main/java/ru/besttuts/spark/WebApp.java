package ru.besttuts.spark;

import spark.ModelAndView;
import spark.servlet.SparkApplication;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

/**
 * @author romanchekashov
 * @since 07.03.2016
 */
public class WebApp implements SparkApplication {

    @Override
    public void init() {
        staticFileLocation("/public");
        threadPool(8);

        get("/", (req, res) -> {
            Map map = new HashMap<>();
            map.put("title", "React • TodoMVC");

            return new ModelAndView(map, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }

    @Override
    public void destroy() {

    }
}
