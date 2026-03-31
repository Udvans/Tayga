package Global;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class ver_3 {

    // Базовички для смены контента
    public static String type_content;
    public static JRadioButton dark, light, dark_green, light_green, dark_pink, light_pink, dark_orange, light_orange;
    public static JScrollPane content_panel;
    public static JFrame window;
    public static JPanel main_panel;
    public static Color Gray_menu;
    public static Color text_color;
    public static ImageIcon icon_hello;


    // Добавление базового JFrame
    public static JFrame create_window(){
        JFrame window = new JFrame("Тайга");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setMinimumSize(new Dimension(1100, 700));
        return window;
    }


    // Добавление контента с меню
    public static void create() {

        text_color  = new Color(0, 0, 0);
        Gray_menu  = new Color(224, 224, 224);
        icon_hello = new ImageIcon(new ImageIcon("src/main/java/Global/image/Tayga_re/Tayga_B.png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT));
        type_content= "Приветствие";

        window = ver_3.create_window();
        content_panel = ver_3.create_content(type_content);

        main_panel = ver_3.create_main_panel();
        main_panel.add(content_panel,BorderLayout.CENTER);

        window.getContentPane().add(main_panel);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }


    // Добавление контента с меню (перезапись)
    public static void recreate() {
        main_panel.remove(content_panel);

        content_panel = ver_3.create_content(type_content);

        main_panel.add(content_panel,BorderLayout.CENTER);
        window.getContentPane().add(main_panel);
        window.setVisible(true);
    }


    // Добавление базовой панели с меню справа
    public static JPanel create_main_panel(){

        JPanel main_panel = new JPanel();
        main_panel.setLayout(new BorderLayout());

        JPanel menu_panel = new JPanel();
        menu_panel.setPreferredSize(new Dimension(250, 700));
        menu_panel.setLayout(new BorderLayout());

        JPanel menu_main_panel= new JPanel();
        JPanel menu_program_panel= new JPanel();

        JPanel menu_main_button_panel = ver_3.add_button(menu_main_panel);


        JButton program_button = create_button("О программе");
        program_button.addActionListener(_ -> {
            if (!Objects.equals(type_content, "О программе")){
                type_content = "О программе";
            } else{
                type_content = "Приветствие";
            }
            System.out.println(type_content);
            ver_3.recreate();
        });
        menu_program_panel.add(program_button);

        Color menu_color = new Color(190, 190, 190);
        menu_program_panel.setBackground(menu_color);
        menu_main_button_panel.setBackground(menu_color);

        menu_panel.add(menu_main_button_panel, BorderLayout.CENTER);
        menu_panel.add(menu_program_panel, BorderLayout.SOUTH);
        main_panel.add(menu_panel, BorderLayout.EAST);

        return main_panel;
    }


    // Добавление кнопок в меню
    public static JPanel add_button(JPanel menu_main_button_panel){

        // Кнопки и обработчики

        JButton go_button = create_button("Вход");
        go_button.addActionListener(_ -> {
            if (!Objects.equals(type_content, "Вход")){
                type_content = "Вход";
            } else{
                type_content = "Приветствие";
            }
            System.out.println(type_content);
            ver_3.recreate();
        });


        JButton shop_button = create_button("Магазин");
        shop_button.addActionListener(_ -> {
            if (!Objects.equals(type_content, "Магазин")){
                type_content = "Магазин";
            } else{
                type_content = "Приветствие";
            }
            System.out.println(type_content);
            ver_3.recreate();
        });


        JButton library_button = create_button("Библиотека");
        library_button.addActionListener(_ -> {
            if (!Objects.equals(type_content, "Библиотека")){
                type_content = "Библиотека";
            } else{
                type_content = "Приветствие";
            }
            System.out.println(type_content);
            ver_3.recreate();
        });


        JButton news_button = create_button("Новости");
        news_button.addActionListener(_ -> {
            if (!Objects.equals(type_content, "Новости")){
                type_content = "Новости";
            } else{
                type_content = "Приветствие";
            }
            System.out.println(type_content);
            ver_3.recreate();
        });


        JButton forum_button = create_button("Форум");
        forum_button.addActionListener(_ -> {
            if (!Objects.equals(type_content, "Форум")){
                type_content = "Форум";
            } else{
                type_content = "Приветствие";
            }
            System.out.println(type_content);
            ver_3.recreate();
        });


        JButton set_button = create_button("Настройки");
        set_button.addActionListener(_ -> {
            if (!Objects.equals(type_content, "Настройки")){
                type_content = "Настройки";
            } else{
                type_content = "Приветствие";
            }
            System.out.println(type_content);
            ver_3.recreate();
        });


        JButton updates_button = create_button("Обновления");
        updates_button.addActionListener(_ -> {
            if (!Objects.equals(type_content, "Обновления")){
                type_content = "Обновления";
            } else{
                type_content = "Приветствие";
            }
            System.out.println(type_content);
            ver_3.recreate();
        });


        menu_main_button_panel.add(go_button);
        menu_main_button_panel.add(shop_button);
        menu_main_button_panel.add(library_button);
        menu_main_button_panel.add(news_button);
        menu_main_button_panel.add(forum_button);
        menu_main_button_panel.add(set_button);
        menu_main_button_panel.add(updates_button);

        return menu_main_button_panel;
    }


    // Добавление кнопки (для add_button)
    public static JButton create_button(String text){
        JButton base_button = new JButton(text);
        base_button.setPreferredSize(new Dimension(220, 40));
        base_button.setFont(new Font("Hello", Font.PLAIN, 20));
        base_button.setFocusPainted(false);
        return base_button;
    }


    // Добавление контента
    public static JScrollPane create_content(String type) {

        JPanel content_panel = new JPanel();
        content_panel.setMinimumSize(new Dimension(800, 400));
        content_panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(3,3,3,3);
        constraints.fill = GridBagConstraints.HORIZONTAL;

        // Изначальный контент
        if (Objects.equals(type, "Приветствие")) {

            JLabel back = new JLabel(icon_hello);

            constraints.gridy = 0;
            constraints.gridx = 0;
            content_panel.add(back, constraints);

            JLabel text_label = new JLabel("Здравствуйте", SwingConstants.CENTER);
            text_label.setFont(new Font("Hello", Font.PLAIN, 20));
            text_label.setForeground(text_color);

            constraints.gridy = 1;
            content_panel.add(text_label, constraints);


        // Кнопка "О программе"
        } else if (Objects.equals(type, "О программе")){

            JLabel main_label = new JLabel("<html>Тайга<br><br></html>", SwingConstants.CENTER);
            main_label.setFont(new Font("Hello", Font.PLAIN, 62));
            main_label.setForeground(text_color);

            constraints.gridy = 0;
            constraints.gridx = 0;
            content_panel.add(main_label, constraints);

            JLabel text_label = new JLabel("<html>Лаунчер для скачивания игр. Ну и курсовая по ооп :3<br>" +
                    "Лаунчер – приложение, главная задача которого запускать<br> " +
                    "различные программы. Компьютерные игры, в том числе.<br><br></html>", SwingConstants.CENTER);
            text_label.setFont(new Font("Hello", Font.PLAIN, 24));
            text_label.setForeground(text_color);

            constraints.gridy = 1;
            content_panel.add(text_label, constraints);

            JLabel text_label2 = new JLabel("<html>Основные аспекты технического задания:<br></html>", SwingConstants.CENTER);
            text_label2.setFont(new Font("Hello", Font.PLAIN, 32));
            text_label2.setForeground(text_color);

            constraints.gridy = 2;
            content_panel.add(text_label2, constraints);

            JLabel text_label3 = new JLabel("<html>Регистрация -<br> Авторизация -<br> Поиск игр -<br> Фильтрация игр -<br> " +
                    "Создание профиля -<br> Скачивание игр -<br> Добавление игр -<br> Редактирование игр -<br> </html>", SwingConstants.CENTER);
            text_label3.setFont(new Font("Hello", Font.PLAIN, 24));
            text_label3.setForeground(text_color);

            constraints.gridy = 3;
            content_panel.add(text_label3, constraints);


        // Вход в систему
        } else if (Objects.equals(type, "Вход")){
            JLabel back = new JLabel("Вход", SwingConstants.CENTER);
            back.setFont(new Font("Hello", Font.PLAIN, 62));
            back.setForeground(text_color);

            constraints.gridwidth = 2;
            constraints.gridy = 0;
            constraints.gridx = 0;
            content_panel.add(back, constraints);


            JLabel login_label = new JLabel("Логин: ");
            login_label.setFont(new Font("Hello", Font.PLAIN, 28));
            login_label.setForeground(text_color);

            constraints.gridwidth = 1;
            constraints.gridx = 0;
            constraints.gridy = 1;
            content_panel.add(login_label, constraints);

            JTextField pole_input_1 = new JTextField("", 10);
            pole_input_1.setFont(new Font("Hello", Font.PLAIN, 28));

            constraints.gridx = 1;
            content_panel.add(pole_input_1, constraints);

            JLabel parol_label = new JLabel("Пароль: ");
            parol_label.setFont(new Font("Hello", Font.PLAIN, 28));
            parol_label.setForeground(text_color);

            constraints.gridx = 0;
            constraints.gridy = 2;
            content_panel.add(parol_label, constraints);

            JTextField pole_input_2 = new JTextField("", 10);
            pole_input_2.setFont(new Font("Hello", Font.PLAIN, 28));

            constraints.gridx = 1;
            content_panel.add(pole_input_2, constraints);

            JButton login_button = create_login_button(pole_input_1, pole_input_2);

            constraints.gridy = 3;
            content_panel.add(login_button, constraints);

            JLabel spase_login = new JLabel("<html><br><br>Не зарегистрированы?</html>", SwingConstants.CENTER);
            spase_login.setFont(new Font("Hello", Font.PLAIN, 16));
            spase_login.setForeground(text_color);

            constraints.gridy = 4;
            content_panel.add(spase_login, constraints);

            JButton register_button = new JButton("Регистрация");
            register_button.setPreferredSize(new Dimension(50, 40));
            register_button.setFont(new Font("Hello", Font.PLAIN, 20));
            register_button.setFocusPainted(false);

            constraints.gridy = 5;
            content_panel.add(register_button, constraints);

        } else if (Objects.equals(type, "Форум")){
            JLabel Start_forum_label = new JLabel("Начало форума", SwingConstants.CENTER);
            Start_forum_label.setFont(new Font("Hello", Font.PLAIN, 62));
            Start_forum_label.setForeground(text_color);

            constraints.gridwidth = 2;
            constraints.gridy = 0;
            constraints.gridx = 0;
            content_panel.add(Start_forum_label, constraints);

            JTextField pole_post = new JTextField("", 20);
            pole_post.setFont(new Font("Hello", Font.PLAIN, 20));

            constraints.gridwidth = 1;
            constraints.gridy = 1;
            constraints.gridx = 0;
            content_panel.add(pole_post, constraints);

            JButton create_post = new JButton("Отправить");
            create_post.setFont(new Font("Hello", Font.PLAIN, 20));
            create_post.setFocusPainted(false);

            constraints.gridx = 1;
            content_panel.add(create_post, constraints);

        } else if (Objects.equals(type, "Настройки")){

            JLabel tema_label = new JLabel("Тема: ");
            tema_label.setFont(new Font("Hello", Font.PLAIN, 20));
            tema_label.setForeground(text_color);

            constraints.gridy = 0;
            constraints.gridx = 0;
            content_panel.add(tema_label, constraints);

            dark = new JRadioButton("Тёмная");
            dark.setFont(new Font("Hello", Font.PLAIN, 20));
            dark.setFocusPainted(false);
            dark.setBackground(Gray_menu);
            dark.setForeground(text_color);

            light = new JRadioButton("Светлая");
            light.setFont(new Font("Hello", Font.PLAIN, 20));
            light.setFocusPainted(false);
            light.setBackground(Gray_menu);
            light.setForeground(text_color);

            dark_green = new JRadioButton("Зелёная тёмная");
            dark_green.setFont(new Font("Hello", Font.PLAIN, 20));
            dark_green.setFocusPainted(false);
            dark_green.setBackground(Gray_menu);
            dark_green.setForeground(text_color);

            light_green = new JRadioButton("Зелёная светлая");
            light_green.setFont(new Font("Hello", Font.PLAIN, 20));
            light_green.setFocusPainted(false);
            light_green.setBackground(Gray_menu);
            light_green.setForeground(text_color);

            dark_pink = new JRadioButton("Розовая тёмная");
            dark_pink.setFont(new Font("Hello", Font.PLAIN, 20));
            dark_pink.setFocusPainted(false);
            dark_pink.setBackground(Gray_menu);
            dark_pink.setForeground(text_color);

            light_pink = new JRadioButton("Розовая светлая");
            light_pink.setFont(new Font("Hello", Font.PLAIN, 20));
            light_pink.setFocusPainted(false);
            light_pink.setBackground(Gray_menu);
            light_pink.setForeground(text_color);

            dark_orange = new JRadioButton("Оранжевая тёмная");
            dark_orange.setFont(new Font("Hello", Font.PLAIN, 20));
            dark_orange.setFocusPainted(false);
            dark_orange.setBackground(Gray_menu);
            dark_orange.setForeground(text_color);

            light_orange = new JRadioButton("Оранжевая светлая");
            light_orange.setFont(new Font("Hello", Font.PLAIN, 20));
            light_orange.setFocusPainted(false);
            light_orange.setBackground(Gray_menu);
            light_orange.setForeground(text_color);

            ButtonGroup group_theme = new ButtonGroup();

            group_theme.add(light);
            group_theme.add(dark);
            group_theme.add(light_green);
            group_theme.add(dark_green);
            group_theme.add(light_pink);
            group_theme.add(dark_pink);
            group_theme.add(light_orange);
            group_theme.add(dark_orange);


            constraints.gridx = 1;
            content_panel.add(light, constraints);

            constraints.gridy = 1;
            content_panel.add(dark, constraints);

            constraints.gridy = 2;
            content_panel.add(light_green, constraints);

            constraints.gridy = 3;
            content_panel.add(dark_green, constraints);

            constraints.gridy = 4;
            content_panel.add(light_pink, constraints);

            constraints.gridy = 5;
            content_panel.add(dark_pink, constraints);

            constraints.gridy = 6;
            content_panel.add(light_orange, constraints);

            constraints.gridy = 7;
            content_panel.add(dark_orange, constraints);

            JButton theme_button = research_button();

            constraints.gridy = 8;
            content_panel.add(theme_button, constraints);

        } else if (Objects.equals(type, "Библиотека")){

            JLabel auto_label = new JLabel("Для начала авторизируйтесь");
            auto_label.setFont(new Font("Hello", Font.PLAIN, 20));
            auto_label.setForeground(text_color);

            constraints.gridy = 0;
            constraints.gridx = 0;
            content_panel.add(auto_label, constraints);

        } else if (Objects.equals(type, "Обновления")){

            JLabel auto_label = new JLabel("Для начала авторизируйтесь");
            auto_label.setFont(new Font("Hello", Font.PLAIN, 20));
            auto_label.setForeground(text_color);

            constraints.gridy = 0;
            constraints.gridx = 0;
            content_panel.add(auto_label, constraints);

        } else if (Objects.equals(type, "Новости")){

            JLabel auto_label = new JLabel("Делаем, начальника");
            auto_label.setFont(new Font("Hello", Font.PLAIN, 20));
            auto_label.setForeground(text_color);

            constraints.gridy = 0;
            constraints.gridx = 0;
            content_panel.add(auto_label, constraints);

        } else if (Objects.equals(type, "Магазин")){

            constraints.gridy = 0;
            constraints.gridx = 0;

            try {
                String imageUrl = "https://udvans.ru/material/Maslo.jpg";
                URL url = new URL(imageUrl);
                ImageIcon imageIcon = new ImageIcon(url);
                JLabel label = new JLabel(imageIcon);
                content_panel.add(label, constraints);
            } catch (IOException e) {
                JLabel errorLabel = new JLabel("Ошибка загрузки изображения");
                content_panel.add(errorLabel, constraints);
            }

        }

        content_panel.setBackground(Gray_menu);

        return new JScrollPane(content_panel);
    }


    // Кнопка смены темы
    private static JButton research_button() {
        JButton theme_button = new JButton("Применить");
        theme_button.setFont(new Font("Hello", Font.PLAIN, 20));
        theme_button.setFocusPainted(false);

        theme_button.addActionListener(_ -> {

            if (dark.isSelected()){
                text_color  = new Color(255, 255, 255);
                Gray_menu = new Color(112, 128, 144);
                icon_hello = new ImageIcon(new ImageIcon("src/main/java/Global/image/Tayga_re/Tayga_W.png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT));
                ver_3.recreate();

            } else if (light.isSelected()){
                text_color  = new Color(0, 0, 0);
                Gray_menu = new Color(224, 224, 224);
                icon_hello = new ImageIcon(new ImageIcon("src/main/java/Global/image/Tayga_re/Tayga_B.png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT));
                ver_3.recreate();

            } else if (dark_green.isSelected()){
                text_color  = new Color(0, 255, 127);
                Gray_menu = new Color(112, 128, 144);
                icon_hello = new ImageIcon(new ImageIcon("src/main/java/Global/image/Tayga_re/Tayga_G.png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT));
                ver_3.recreate();

            } else if (light_green.isSelected()){
                text_color  = new Color(46, 139, 87);
                Gray_menu = new Color(224, 224, 224);
                icon_hello = new ImageIcon(new ImageIcon("src/main/java/Global/image/Tayga_re/Tayga_G.png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT));
                ver_3.recreate();

            } else if (dark_pink.isSelected()){
                text_color  = new Color(221, 160, 221);
                Gray_menu = new Color(112, 128, 144);
                icon_hello = new ImageIcon(new ImageIcon("src/main/java/Global/image/Tayga_re/Tayga_F.png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT));
                ver_3.recreate();

            } else if (light_pink.isSelected()){
                text_color  = new Color(238, 130, 238);
                Gray_menu = new Color(224, 224, 224);
                icon_hello = new ImageIcon(new ImageIcon("src/main/java/Global/image/Tayga_re/Tayga_F.png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT));
                ver_3.recreate();

            }  else if (dark_orange.isSelected()){
                text_color  = new Color(220, 165, 117);
                Gray_menu = new Color(112, 128, 144);
                icon_hello = new ImageIcon(new ImageIcon("src/main/java/Global/image/Tayga_re/Tayga_O.png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT));
                ver_3.recreate();

            } else if (light_orange.isSelected()){
                text_color  = new Color(184, 134, 11);
                Gray_menu = new Color(224, 224, 224);
                icon_hello = new ImageIcon(new ImageIcon("src/main/java/Global/image/Tayga_re/Tayga_O.png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT));
                ver_3.recreate();
            }
        });
        return theme_button;
    }


    // Обработка входа
    private static JButton create_login_button(JTextField pole_input_1, JTextField pole_input_2) {
        JButton login_button = new JButton("Войти");
        login_button.setPreferredSize(new Dimension(50, 40));
        login_button.setFont(new Font("Hello", Font.PLAIN, 20));
        login_button.setFocusPainted(false);

        login_button.addActionListener(_ -> {
            String username = pole_input_1.getText();
            String user_parol = pole_input_2.getText();

            System.out.println(username);
            System.out.println(user_parol);
        });
        return login_button;
    }
}
