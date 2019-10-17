/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purplebox;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oxcom
 */
public class PurpleBoxGUI extends javax.swing.JFrame {

    public ArrayList<Disc> ShoppingCartList = new ArrayList<>();
    public ArrayList<Disc> GameList = new ArrayList<>();
    public ArrayList<Disc> MovieList = new ArrayList<>();
    
    public DefaultTableModel CartModel;
    public DefaultTableModel GameModel;    
    public DefaultTableModel MovieModel;
    public DefaultTableModel AdminMovieModel;
    public DefaultTableModel AdminGameModel;
    
    public int VolumeDiscount = 3;
    
    PurpleBox myBox = new PurpleBox();

    public PurpleBoxGUI() {
        initComponents();
        this.MovieModel = (DefaultTableModel) MoviesTable.getModel();
        this.GameModel = (DefaultTableModel) GamesTable.getModel();
        this.CartModel = (DefaultTableModel) ShoppingCartTable.getModel();
        this.AdminMovieModel = (DefaultTableModel) MoviesTable.getModel();
        this.AdminGameModel = (DefaultTableModel) GamesTable.getModel();
        
        //PurpleBox.setEnabledAt(4, false);
        
        
        
        MovieList.add(new Disc("The Godfather", "Drama", "DVD", "1972", 98, 2, 2.99) {
        });
        MovieList.add(new Disc("Citizen Kane", "Drama", "DVD", "1941", 100, 6, 2.99) {
        });
        MovieList.add(new Disc("Pulp Fiction", "Drama", "DVD", "1994", 92, 14, 2.99) {
        });
        MovieList.add(new Disc("Schindler's List", "Drama", "DVD", "1993", 93, 11, 2.99) {
        });
        MovieList.add(new Disc("Star Wars: Episode IV", "Sci-fi", "DVD", "1977", 93, 7, 2.99) {
        });
        MovieList.add(new Disc("The Dark Knight", "Drama", "DVD", "2008", 94, 17, 2.99) {
        });
        MovieList.add(new Disc("Taxi Driver", "Mystery", "DVD", "1976", 98, 1, 2.99) {
        });
        MovieList.add(new Disc("Apocalypse Now", "Drama", "DVD", "1979", 97, 1, 2.99) {
        });
        MovieList.add(new Disc("2001: A Space Odyssey", "Fantasy", "DVD", "1968", 93, 1, 2.99) {
        });
        MovieList.add(new Disc("The Shawshank Redemption", "Drama", "DVD", "1994", 90, 1, 2.99) {
        });
        MovieList.add(new Disc("Spider-Man: Far from Home", "Sci-Fi", "BluRay", "2019", 93, 1, 2.99) {
        });
        MovieList.add(new Disc("X-Men: Dark Phoenix", "Sci-Fi", "BluRay", "2019", 90, 1, 2.99) {
        });
        MovieList.add(new Disc("Toy Story 4", "Fantasy", "Bluray", "2019", 91, 1, 2.99) {
        });
        MovieList.add(new Disc("Avengers: Endgame", "Sci-Fi", "BluRay", "2019", 98, 1, 2.99) {
        });
        MovieList.add(new Disc("Shrek 15: The Swampening", "Horror", "BluRay", "2019", 100, 1, 2.99) {
        });
        
        for (Disc disc : MovieList) {
            MovieModel.addRow(new Object[]{
                disc.getTitle(), disc.getGenre(), disc.getType(),
                disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
            AdminMovieModel.addRow(new Object[]{
                disc.getTitle(), disc.getGenre(), disc.getType(),
                disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
            
        }
        
        GameList.add(new Disc("Battlefield 5", "Action", "XboxOne", "2018", 89, 1, 2.99) {
        });
        GameList.add(new Disc("NBA 2K20", "Sports", "XboxOne", "2017", 76, 1, 2.99) {
        });
        GameList.add(new Disc("Destiny 2", "Sci-Fi", "XboxOne", "2017", 92, 1, 2.99) {
        });
        GameList.add(new Disc("Call of Duty: Black Ops 4", "Action", "XboxOne", "2018", 85, 1, 2.99) {
        });
        GameList.add(new Disc("BorderLands 3", "Action", "XboxOne", "2019", 79, 1, 2.99) {
        });
        GameList.add(new Disc("God of War", "Fantasy", "PS4", "2019", 95, 1, 2.99) {
        });
        GameList.add(new Disc("Tom Clancy's Ghost Recon: BreakPoint", "Action", "PS4", "2019", 98, 1, 2.99) {
        });
        GameList.add(new Disc("Star Wars: Jedi Fallen Order", "Sci-Fi", "PS4", "2019", 89, 1, 2.99) {
        });
        GameList.add(new Disc("Watchdogs", "Action", "PS4", "2019", 89, 1, 2.99) {
        });
        GameList.add(new Disc("Doom: Eternal", "Action", "PS4", "2020", 100, 1, 2.99) {
        });
        
        for (Disc disc : GameList) {
            GameModel.addRow(new Object[]{
                disc.getTitle(), disc.getGenre(), disc.getType(),
                disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
            AdminGameModel.addRow(new Object[]{
                disc.getTitle(), disc.getGenre(), disc.getType(),
                disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
            
        }
        
        for (Disc disc : ShoppingCartList) {
            CartModel.addRow(new Object[]{
                disc.getTitle(), disc.getGenre(), disc.getType(),
                disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
            
        }
        
        myBox.setGames(GameList);
        myBox.setMovies(MovieList);
        myBox.setShoppingCart(ShoppingCartList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        PurpleBox = new javax.swing.JTabbedPane();
        Home = new java.awt.Panel();
        HomeMessage = new java.awt.Label();
        AdminLogin = new javax.swing.JButton();
        Movies = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MoviesTable = new javax.swing.JTable();
        AddToCartMovie = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextOutputMovies = new javax.swing.JTextArea();
        returnMovie = new javax.swing.JButton();
        Games = new java.awt.Panel();
        jScrollPane3 = new javax.swing.JScrollPane();
        GamesTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextOutputGames = new javax.swing.JTextArea();
        AddToCartGame = new javax.swing.JButton();
        returnGame = new javax.swing.JButton();
        ShoppingCart = new java.awt.Panel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ShoppingCartTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        ShoppingCartOutput = new javax.swing.JTextArea();
        RemoveFromCartButton = new javax.swing.JButton();
        RemoveAllButton = new javax.swing.JButton();
        CheckoutButton = new javax.swing.JButton();
        textField8 = new java.awt.TextField();
        textField9 = new java.awt.TextField();
        CodeTextField = new java.awt.TextField();
        SubmitCodeButton = new javax.swing.JButton();
        textField11 = new java.awt.TextField();
        GetTotalButton = new javax.swing.JButton();
        ADMINPanel = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        AdminMovieTable1 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        AdminGameTable1 = new javax.swing.JTable();
        Remove1 = new javax.swing.JButton();
        RemoveAllAdmin1 = new javax.swing.JButton();
        ChangePriceDVD1 = new javax.swing.JButton();
        ChangePriceBluRay1 = new javax.swing.JButton();
        VolumeDiscountLabel1 = new javax.swing.JLabel();
        VolumeDiscountField1 = new java.awt.TextField();
        jButton3 = new javax.swing.JButton();
        CodeLabel2 = new javax.swing.JLabel();
        TitleField1 = new java.awt.TextField();
        GenreSpinner1 = new javax.swing.JSpinner();
        TypeSpinner1 = new javax.swing.JSpinner();
        Release1 = new java.awt.TextField();
        CriticScoreSpinner1 = new javax.swing.JSpinner();
        QuantitySpinner1 = new javax.swing.JSpinner();
        Price1 = new java.awt.TextField();
        AddDisc1 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setFocusableWindowState(false);
        setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        setName("PurpleBoxFrame"); // NOI18N

        PurpleBox.setBackground(new java.awt.Color(76, 44, 118));
        PurpleBox.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        PurpleBox.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        HomeMessage.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        HomeMessage.setForeground(new java.awt.Color(204, 204, 204));
        HomeMessage.setText("Welcome to Purple Box. Select a tab to get started renting your favorite games and movies!");

        AdminLogin.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        AdminLogin.setText("Admin Login");
        AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(HomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357)
                .addComponent(AdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PurpleBox.addTab("Home", Home);

        Movies.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        MoviesTable.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        MoviesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Genre", "Type", "Release", "Critic Rating", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        MoviesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(MoviesTable);

        AddToCartMovie.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        AddToCartMovie.setText("Add To Cart");
        AddToCartMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartMovieActionPerformed(evt);
            }
        });

        TextOutputMovies.setColumns(20);
        TextOutputMovies.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        TextOutputMovies.setRows(5);
        jScrollPane1.setViewportView(TextOutputMovies);

        returnMovie.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        returnMovie.setText("Return Movie");

        javax.swing.GroupLayout MoviesLayout = new javax.swing.GroupLayout(Movies);
        Movies.setLayout(MoviesLayout);
        MoviesLayout.setHorizontalGroup(
            MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoviesLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MoviesLayout.createSequentialGroup()
                        .addComponent(AddToCartMovie, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addGap(416, 416, 416)
                        .addComponent(returnMovie))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        MoviesLayout.setVerticalGroup(
            MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoviesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddToCartMovie)
                    .addComponent(returnMovie))
                .addContainerGap())
            .addComponent(jScrollPane2)
        );

        PurpleBox.addTab("Movies", Movies);

        GamesTable.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        GamesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Genre", "Type", "Release", "Critic Rating", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        GamesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(GamesTable);

        TextOutputGames.setColumns(20);
        TextOutputGames.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        TextOutputGames.setRows(5);
        jScrollPane4.setViewportView(TextOutputGames);

        AddToCartGame.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        AddToCartGame.setText("Add To Cart");
        AddToCartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartGameActionPerformed(evt);
            }
        });

        returnGame.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        returnGame.setText("Return Game");

        javax.swing.GroupLayout GamesLayout = new javax.swing.GroupLayout(Games);
        Games.setLayout(GamesLayout);
        GamesLayout.setHorizontalGroup(
            GamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamesLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                    .addGroup(GamesLayout.createSequentialGroup()
                        .addComponent(AddToCartGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnGame)))
                .addContainerGap())
        );
        GamesLayout.setVerticalGroup(
            GamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamesLayout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddToCartGame)
                    .addComponent(returnGame))
                .addGap(10, 10, 10))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        PurpleBox.addTab("Games", Games);

        ShoppingCartTable.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        ShoppingCartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Genre", "Type", "Release", "Critic Rating", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(ShoppingCartTable);

        ShoppingCartOutput.setColumns(20);
        ShoppingCartOutput.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        ShoppingCartOutput.setRows(5);
        jScrollPane6.setViewportView(ShoppingCartOutput);

        RemoveFromCartButton.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        RemoveFromCartButton.setText("Remove From Cart");
        RemoveFromCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveFromCartButtonActionPerformed(evt);
            }
        });

        RemoveAllButton.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        RemoveAllButton.setText("Remove All From Cart");
        RemoveAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAllButtonActionPerformed(evt);
            }
        });

        CheckoutButton.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        CheckoutButton.setText("Checkout");
        CheckoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutButtonActionPerformed(evt);
            }
        });

        textField8.setText("textField8");

        textField9.setText("textField9");

        CodeTextField.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        CodeTextField.setText("Enter Promo Code Here");

        SubmitCodeButton.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        SubmitCodeButton.setText("Submit Code");

        textField11.setText("textField11");

        GetTotalButton.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        GetTotalButton.setText("Get Total");

        javax.swing.GroupLayout ShoppingCartLayout = new javax.swing.GroupLayout(ShoppingCart);
        ShoppingCart.setLayout(ShoppingCartLayout);
        ShoppingCartLayout.setHorizontalGroup(
            ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShoppingCartLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(ShoppingCartLayout.createSequentialGroup()
                        .addComponent(CheckoutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                        .addComponent(CodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SubmitCodeButton))
                    .addGroup(ShoppingCartLayout.createSequentialGroup()
                        .addGroup(ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RemoveAllButton)
                            .addComponent(GetTotalButton)
                            .addComponent(RemoveFromCartButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ShoppingCartLayout.setVerticalGroup(
            ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
            .addGroup(ShoppingCartLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RemoveFromCartButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RemoveAllButton)
                .addGap(12, 12, 12)
                .addComponent(GetTotalButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CheckoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubmitCodeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PurpleBox.addTab("Shopping Cart", ShoppingCart);

        ADMINPanel.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        AdminMovieTable1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        AdminMovieTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title", "Genre", "Type", "Release", "Critic Score", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane10.setViewportView(AdminMovieTable1);

        AdminGameTable1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        AdminGameTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title", "Genre", "Type", "Release", "Critic Score", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane11.setViewportView(AdminGameTable1);

        Remove1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        Remove1.setText("Remove");
        Remove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove1ActionPerformed(evt);
            }
        });

        RemoveAllAdmin1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        RemoveAllAdmin1.setText("Remove All");
        RemoveAllAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAllAdmin1ActionPerformed(evt);
            }
        });

        ChangePriceDVD1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        ChangePriceDVD1.setText("Change Price of DVD");
        ChangePriceDVD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePriceDVD1ActionPerformed(evt);
            }
        });

        ChangePriceBluRay1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        ChangePriceBluRay1.setText("Change Price of BluRay");
        ChangePriceBluRay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePriceBluRay1ActionPerformed(evt);
            }
        });

        VolumeDiscountLabel1.setText("Enter New Volume Discount: ");

        VolumeDiscountField1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        VolumeDiscountField1.setText("Enter an Integer");
        VolumeDiscountField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumeDiscountField1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jButton3.setText("Set Discount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        CodeLabel2.setText("Enter New Disc:");

        TitleField1.setText("Title");
        TitleField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField1ActionPerformed(evt);
            }
        });

        GenreSpinner1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        GenreSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {"Genre", "Drama", "Action", "Comedy", "Sci-Fi", "Fantasy", "RPG", "Adventure"}));
        GenreSpinner1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenreSpinner1MouseClicked(evt);
            }
        });

        TypeSpinner1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        TypeSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {"DVD", "BluRay", "XboxOne", "PS4"}));
        TypeSpinner1.setName("TypeSpinner"); // NOI18N

        Release1.setText("Release Year");
        Release1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Release1ActionPerformed(evt);
            }
        });

        CriticScoreSpinner1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        CriticScoreSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        QuantitySpinner1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        QuantitySpinner1.setModel(new javax.swing.SpinnerNumberModel(0, null, 5, 1));
        QuantitySpinner1.setInheritsPopupMenu(true);
        QuantitySpinner1.setValue(10);

        Price1.setName("Price"); // NOI18N
        Price1.setText("Price");

        AddDisc1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        AddDisc1.setText("Add Disc");

        javax.swing.GroupLayout ADMINPanelLayout = new javax.swing.GroupLayout(ADMINPanel);
        ADMINPanel.setLayout(ADMINPanelLayout);
        ADMINPanelLayout.setHorizontalGroup(
            ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINPanelLayout.createSequentialGroup()
                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RemoveAllAdmin1)
                    .addComponent(ChangePriceDVD1)
                    .addComponent(ChangePriceBluRay1)
                    .addComponent(Remove1)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ADMINPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane11))
                    .addGroup(ADMINPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ADMINPanelLayout.createSequentialGroup()
                                .addComponent(VolumeDiscountLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VolumeDiscountField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(ADMINPanelLayout.createSequentialGroup()
                                .addComponent(CodeLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TitleField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GenreSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TypeSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Release1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CriticScoreSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(QuantitySpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(AddDisc1)))
                        .addGap(48, 48, 48))))
        );
        ADMINPanelLayout.setVerticalGroup(
            ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINPanelLayout.createSequentialGroup()
                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ADMINPanelLayout.createSequentialGroup()
                        .addComponent(Remove1)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveAllAdmin1)
                        .addGap(18, 18, 18)
                        .addComponent(ChangePriceDVD1)
                        .addGap(18, 18, 18)
                        .addComponent(ChangePriceBluRay1))
                    .addGroup(ADMINPanelLayout.createSequentialGroup()
                        .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(VolumeDiscountLabel1)
                                .addComponent(VolumeDiscountField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(GenreSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TypeSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CriticScoreSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(QuantitySpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Release1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CodeLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TitleField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AddDisc1))
                        .addGap(14, 14, 14)))
                .addGap(0, 75, Short.MAX_VALUE))
        );

        PurpleBox.addTab("ADMIN", ADMINPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PurpleBox)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PurpleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Release1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Release1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Release1ActionPerformed

    private void GenreSpinner1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenreSpinner1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GenreSpinner1MouseClicked

    private void TitleField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void VolumeDiscountField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumeDiscountField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VolumeDiscountField1ActionPerformed

    private void ChangePriceBluRay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePriceBluRay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangePriceBluRay1ActionPerformed

    private void ChangePriceDVD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePriceDVD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangePriceDVD1ActionPerformed

    private void RemoveAllAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAllAdmin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveAllAdmin1ActionPerformed

    private void Remove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Remove1ActionPerformed

    private void CheckoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutButtonActionPerformed
        // TODO add your handling code here:
        String CCNumber = JOptionPane.showInputDialog(rootPane, "Please Enter A 16 Digit Credit Card Number: ");

        if (CCNumber.length() == 16) {
            myBox.pay(CCNumber, ShoppingCartList);
            JOptionPane.showConfirmDialog(rootPane, "Would you like to recieve an Email Reciept?");
            System.out.println(JOptionPane.showConfirmDialog(rootPane, ""));
        } else {
            ShoppingCartOutput.append(CCNumber + " is not a valid CC number. Try Again.");
        }
    }//GEN-LAST:event_CheckoutButtonActionPerformed

    private void RemoveAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAllButtonActionPerformed
        for (int i = 0; i < ShoppingCartList.size(); i++) {
            CartModel.removeRow(i);
            System.out.println(i);
        }
        myBox.removeAll(ShoppingCartList);
        System.out.println(ShoppingCartList);
    }//GEN-LAST:event_RemoveAllButtonActionPerformed

    private void RemoveFromCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFromCartButtonActionPerformed
        // TODO add your handling code here:
        Disc temp = new Disc();
        for (int i = 0; i < ShoppingCartList.size(); i++) {
            if (ShoppingCartList.get(i).getTitle().compareTo((String) ShoppingCartTable.getValueAt(ShoppingCartTable.getSelectedRow(), NORMAL)) == 0) {
                temp = ShoppingCartList.get(i);
                CartModel.removeRow(i);
                System.out.println("i is: "+i);
            }

        }

        //myBox.remove(temp, ShoppingCartList);
        if(!(ShoppingCartList.isEmpty())) {
            System.out.println(ShoppingCartList);
        }
    }//GEN-LAST:event_RemoveFromCartButtonActionPerformed

    private void AddToCartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartGameActionPerformed

        Disc temp = new Disc();

        for (int i = 0; i < GameList.size(); i++) {
            if (GameList.get(i).getTitle().compareTo((String) GamesTable.getValueAt(GamesTable.getSelectedRow(), NORMAL)) == 0) {
                temp = GameList.get(i);
                CartModel.addRow(new Object[]{
                    temp.getTitle(),
                    temp.getGenre(),
                    temp.getType(),
                    temp.getRelease(),
                    temp.getCriticScore(),
                    0x1,
                    temp.getPrice()
                });
            }

        }

        myBox.addToCart(temp, ShoppingCartList, GameList);

        System.out.println(ShoppingCartList);
    }//GEN-LAST:event_AddToCartGameActionPerformed

    private void AddToCartMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartMovieActionPerformed

        Disc temp = new Disc();

        for (int i = 0; i < MovieList.size(); i++) {
            if (MovieList.get(i).getTitle().compareTo((String) MoviesTable.getValueAt(MoviesTable.getSelectedRow(), NORMAL)) == 0) {
                temp = MovieList.get(i);
                CartModel.addRow(new Object[]{
                    temp.getTitle(),
                    temp.getGenre(),
                    temp.getType(),
                    temp.getRelease(),
                    temp.getCriticScore(),
                    0x1,
                    temp.getPrice()
                });
            }

        }

        myBox.addToCart(temp, ShoppingCartList, MovieList);

        System.out.println(ShoppingCartList);

    }//GEN-LAST:event_AddToCartMovieActionPerformed

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed
        // TODO add your handling code here:
        String PassKey = JOptionPane.showInputDialog(rootPane, "Enter Your PassKey", DISPOSE_ON_CLOSE);
        if (PassKey.equalsIgnoreCase("12345")) {
            JOptionPane.showMessageDialog(AdminLogin, "PassKey Accepted");
            //PurpleBox.setEnabledAt(4, true);
        } else {
            JOptionPane.showMessageDialog(AdminLogin, "Wrong PassKey");
        }
    }//GEN-LAST:event_AdminLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PurpleBoxGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurpleBoxGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurpleBoxGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurpleBoxGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PurpleBoxGUI().setVisible(true);
            }
        });

        //Start the PurpleBox Code Here
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADMINPanel;
    private javax.swing.JButton AddDisc1;
    private javax.swing.JButton AddToCartGame;
    private javax.swing.JButton AddToCartMovie;
    private javax.swing.JTable AdminGameTable1;
    private javax.swing.JButton AdminLogin;
    private javax.swing.JTable AdminMovieTable1;
    private javax.swing.JButton ChangePriceBluRay1;
    private javax.swing.JButton ChangePriceDVD1;
    private javax.swing.JButton CheckoutButton;
    private javax.swing.JLabel CodeLabel2;
    private java.awt.TextField CodeTextField;
    private javax.swing.JSpinner CriticScoreSpinner1;
    private java.awt.Panel Games;
    private javax.swing.JTable GamesTable;
    private javax.swing.JSpinner GenreSpinner1;
    private javax.swing.JButton GetTotalButton;
    private java.awt.Panel Home;
    private java.awt.Label HomeMessage;
    private java.awt.Panel Movies;
    private javax.swing.JTable MoviesTable;
    private java.awt.TextField Price1;
    private javax.swing.JTabbedPane PurpleBox;
    private javax.swing.JSpinner QuantitySpinner1;
    private java.awt.TextField Release1;
    private javax.swing.JButton Remove1;
    private javax.swing.JButton RemoveAllAdmin1;
    private javax.swing.JButton RemoveAllButton;
    private javax.swing.JButton RemoveFromCartButton;
    private java.awt.Panel ShoppingCart;
    private javax.swing.JTextArea ShoppingCartOutput;
    private javax.swing.JTable ShoppingCartTable;
    private javax.swing.JButton SubmitCodeButton;
    private javax.swing.JTextArea TextOutputGames;
    private javax.swing.JTextArea TextOutputMovies;
    private java.awt.TextField TitleField1;
    private javax.swing.JSpinner TypeSpinner1;
    private java.awt.TextField VolumeDiscountField1;
    private javax.swing.JLabel VolumeDiscountLabel1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private javax.swing.JButton returnGame;
    private javax.swing.JButton returnMovie;
    private java.awt.TextField textField11;
    private java.awt.TextField textField8;
    private java.awt.TextField textField9;
    // End of variables declaration//GEN-END:variables
}
