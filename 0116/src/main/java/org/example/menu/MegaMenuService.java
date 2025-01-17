package org.example.menu;

import java.util.ArrayList;

//3. MenuService 상속
//override 안하면 에러남
public class MegaMenuService extends MenuService {
    @Override
    public ArrayList<Menu> getMenuList() {
        return null;
    }
}
