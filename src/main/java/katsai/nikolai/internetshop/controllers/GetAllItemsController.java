package katsai.nikolai.internetshop.controllers;

import java.io.IOException;

import java.sql.SQLException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import katsai.nikolai.internetshop.lib.Inject;
import katsai.nikolai.internetshop.models.Item;
import katsai.nikolai.internetshop.services.ItemService;

public class GetAllItemsController extends HttpServlet {
    @Inject
    private static ItemService itemService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Item> items = null;
        try {
            items = itemService.getAllItems();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("items", items);
        req.getRequestDispatcher("/WEB-INF/views/allItems.jsp").forward(req, resp);
    }
}
