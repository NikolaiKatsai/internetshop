package katsai.nikolai.internetshop.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import katsai.nikolai.internetshop.lib.Inject;
import katsai.nikolai.internetshop.models.User;
import katsai.nikolai.internetshop.services.BucketService;
import katsai.nikolai.internetshop.services.UserService;

public class AddItemToBucketController extends HttpServlet {
    @Inject
    private static UserService userService;
    @Inject
    private static BucketService bucketService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Long userId = (Long) req.getSession().getAttribute("user-id");
        User user = userService.get(userId);

        Long bucketId = user.getBucket().getBucketId();
        Long itemId = Long.valueOf(req.getParameter("item-id"));
        bucketService.addItem(bucketId, itemId);

        resp.sendRedirect(req.getContextPath() + "/");
    }
}
