package com.Backend.SpringBoot.E_Commerce_backend.services;

import com.Backend.SpringBoot.E_Commerce_backend.model.LocalUser;
import com.Backend.SpringBoot.E_Commerce_backend.model.WebOrder;
import com.Backend.SpringBoot.E_Commerce_backend.model.dao.WebOrderDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServices {


    private WebOrderDAO webOrderDAO ;

    public OrderServices(WebOrderDAO webOrderDAO) {
        this.webOrderDAO = webOrderDAO;
    }

    public List<WebOrder> getOrders (LocalUser user){
        return webOrderDAO.findByUser(user);
    }
}
/*
OrderServices adalah kelas yang membantu kita mengelola semua hal tentang pesanan di toko online.
Di dalamnya, kita menggunakan WebOrderDAO (Data Access Object) untuk mengakses data dari database terkait pesanan.
Fungsinya getOrders akan mengembalikan daftar pesanan berdasarkan pengguna yang diberikan (LocalUser).
 */
