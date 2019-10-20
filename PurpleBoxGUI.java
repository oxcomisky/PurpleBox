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
    public ArrayList<PromoCode> PromoCodeList = new ArrayList<>();
    
    public DefaultTableModel CartModel;
    public DefaultTableModel GameModel;    
    public DefaultTableModel MovieModel;
    public DefaultTableModel AdminMovieModel;
    public DefaultTableModel AdminGameModel;
    
    public double total = 0.0;
    
    public int VolumeDiscount = 3;
    
    PurpleBox myBox = new PurpleBox();
    

    public PurpleBoxGUI() {
        initComponents();
        this.MovieModel = (DefaultTableModel) MoviesTable.getModel();
        this.GameModel = (DefaultTableModel) GamesTable.getModel();
        this.CartModel = (DefaultTableModel) ShoppingCartTable.getModel();
        this.AdminMovieModel = (DefaultTableModel) AdminMovieTable1.getModel();
        this.AdminGameModel = (DefaultTableModel) AdminGameTable1.getModel();
        
        PurpleBox.setEnabledAt(4, false);
        
        PromoCodeList.add(new PromoCode(12345,2));
        PromoCodeList.add(new PromoCode(123,1));
        PromoCodeList.add(new PromoCode(1111,3));
        PromoCodeList.add(new PromoCode(999,2));
        
        
        MovieList.add(new Disc("The Godfather", "Drama", "DVD", "1972", 98, 0, 2.99) {
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
        MovieList.add(new Disc("Toy Story 4", "Fantasy", "BluRay", "2019", 91, 1, 2.99) {
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
        myBox.setPromoCode(PromoCodeList);
        MovieModel.addTableModelListener(MoviesTable);
        GameModel.addTableModelListener(GamesTable);
        AdminGameModel.addTableModelListener(AdminGameTable1);
        AdminMovieModel.addTableModelListener(AdminMovieTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PurpleBox = new javax.swing.JTabbedPane();
        Home = new java.awt.Panel();
        HomeMessage = new java.awt.Label();
        AdminLogin = new javax.swing.JButton();
        textField1 = new java.awt.TextField();
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
        jButton3 = new javax.swing.JButton();
        CodeLabel2 = new javax.swing.JLabel();
        AddDiscButton = new javax.swing.JButton();
        GenreCombo = new javax.swing.JComboBox<>();
        TypeCombo = new javax.swing.JComboBox<>();
        PriceCombo = new javax.swing.JComboBox<>();
        TitleField = new javax.swing.JTextField();
        ChangePriceGameButton = new javax.swing.JButton();
        ReleaseYearField = new java.awt.TextField();
        CriticScoreField = new java.awt.TextField();
        QuantityField = new java.awt.TextField();
        label1 = new java.awt.Label();
        addPromoCodeField = new java.awt.TextField();
        codeTypeCombo = new javax.swing.JComboBox<>();
        AddPromoCodeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        setName("PurpleBoxFrame"); // NOI18N

        PurpleBox.setBackground(new java.awt.Color(76, 44, 118));
        PurpleBox.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        PurpleBox.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        PurpleBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PurpleBoxMouseClicked(evt);
            }
        });

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

        textField1.setText("textField1");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(HomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 156, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(MoviesLayout.createSequentialGroup()
                        .addComponent(AddToCartMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(returnMovie))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(GamesLayout.createSequentialGroup()
                        .addComponent(AddToCartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(returnGame))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        CodeTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CodeTextFieldMouseClicked(evt);
            }
        });

        SubmitCodeButton.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        SubmitCodeButton.setText("Submit Code");
        SubmitCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitCodeButtonActionPerformed(evt);
            }
        });

        textField11.setText("textField11");

        GetTotalButton.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        GetTotalButton.setText("Get Total");
        GetTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetTotalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShoppingCartLayout = new javax.swing.GroupLayout(ShoppingCart);
        ShoppingCart.setLayout(ShoppingCartLayout);
        ShoppingCartLayout.setHorizontalGroup(
            ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShoppingCartLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ShoppingCartLayout.createSequentialGroup()
                        .addGroup(ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RemoveAllButton)
                            .addComponent(RemoveFromCartButton)
                            .addComponent(GetTotalButton)
                            .addComponent(CheckoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubmitCodeButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        ShoppingCartLayout.setVerticalGroup(
            ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
            .addGroup(ShoppingCartLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addGroup(ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShoppingCartLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(ShoppingCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ShoppingCartLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(SubmitCodeButton))
                            .addComponent(CodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ShoppingCartLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RemoveFromCartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RemoveAllButton)
                        .addGap(12, 12, 12)
                        .addComponent(GetTotalButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PurpleBox.addTab("Shopping Cart", ShoppingCart);

        ADMINPanel.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        AdminMovieTable1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        AdminMovieTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        AdminMovieTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminMovieTable1MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(AdminMovieTable1);

        AdminGameTable1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        AdminGameTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        jButton3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jButton3.setText("Set Volume Discount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        CodeLabel2.setText("Enter New Disc:");

        AddDiscButton.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        AddDiscButton.setText("Add Disc");
        AddDiscButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDiscButtonActionPerformed(evt);
            }
        });

        GenreCombo.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        GenreCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Horror", "Comedy", "Sci-Fi", "Fantasy", "Drama" }));

        TypeCombo.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        TypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DVD", "BluRay", "PS4", "XboxOne" }));

        PriceCombo.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        PriceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.99", "1.99", "2.99", "3.99", "4.99" }));

        TitleField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TitleField.setText("Title");
        TitleField.setNextFocusableComponent(TitleField);
        TitleField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TitleFieldMouseClicked(evt);
            }
        });
        TitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleFieldActionPerformed(evt);
            }
        });

        ChangePriceGameButton.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        ChangePriceGameButton.setText("Change Price of Games");
        ChangePriceGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePriceGameButtonActionPerformed(evt);
            }
        });

        ReleaseYearField.setText("Release Year");
        ReleaseYearField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReleaseYearFieldMouseClicked(evt);
            }
        });
        ReleaseYearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReleaseYearFieldActionPerformed(evt);
            }
        });

        CriticScoreField.setText("Critic Score");
        CriticScoreField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CriticScoreFieldMouseClicked(evt);
            }
        });
        CriticScoreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriticScoreFieldActionPerformed(evt);
            }
        });

        QuantityField.setText("Quantity");
        QuantityField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuantityFieldMouseClicked(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        label1.setText("Enter new Promo Code:");

        addPromoCodeField.setText("Promo Code");
        addPromoCodeField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPromoCodeFieldMouseClicked(evt);
            }
        });

        codeTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        AddPromoCodeButton.setText("Add PromoCode");
        AddPromoCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPromoCodeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ADMINPanelLayout = new javax.swing.GroupLayout(ADMINPanel);
        ADMINPanel.setLayout(ADMINPanelLayout);
        ADMINPanelLayout.setHorizontalGroup(
            ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ADMINPanelLayout.createSequentialGroup()
                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                    .addComponent(Remove1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveAllAdmin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChangePriceDVD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChangePriceBluRay1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11)
                    .addGroup(ADMINPanelLayout.createSequentialGroup()
                        .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ADMINPanelLayout.createSequentialGroup()
                                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ADMINPanelLayout.createSequentialGroup()
                                        .addComponent(CodeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(ADMINPanelLayout.createSequentialGroup()
                                        .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ADMINPanelLayout.createSequentialGroup()
                                                .addComponent(TypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ReleaseYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CriticScoreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ADMINPanelLayout.createSequentialGroup()
                                                .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                                .addComponent(PriceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(GenreCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(10, 10, 10)
                                .addComponent(AddDiscButton, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ChangePriceGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(ADMINPanelLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(addPromoCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddPromoCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        ADMINPanelLayout.setVerticalGroup(
            ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jButton3)
                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ADMINPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(CodeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ADMINPanelLayout.createSequentialGroup()
                                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GenreCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ADMINPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(ReleaseYearField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ADMINPanelLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(CriticScoreField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ADMINPanelLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(QuantityField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(AddDiscButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ADMINPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Remove1)
                        .addGap(19, 19, 19)
                        .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemoveAllAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChangePriceDVD1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPromoCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codeTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddPromoCodeButton)))
                .addGap(18, 18, 18)
                .addGroup(ADMINPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangePriceBluRay1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangePriceGameButton))
                .addContainerGap())
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

    private void AddToCartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartGameActionPerformed

        Disc temp = new Disc();

        for (int i = 0; i < myBox.getGames().size(); i++) {
            if (myBox.getGames().get(i).getTitle().compareTo((String) GamesTable.getValueAt(GamesTable.getSelectedRow(), NORMAL)) == 0) {
                temp = myBox.getGames().get(i);
                if(myBox.getGames().get(i).getQuantity() > 0){
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

        }
        //myBox.setShoppingCart(myBox.getShoppingCart());
        myBox.addToCart(temp, myBox.getShoppingCart(), myBox.getGames());
        
        //System.out.println(myBox.getShoppingCart());
    }//GEN-LAST:event_AddToCartGameActionPerformed

    private void AddToCartMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartMovieActionPerformed

        Disc temp = new Disc();

        for (int i = 0; i < myBox.getMovies().size(); i++) {
            if (myBox.getMovies().get(i).getTitle().compareTo((String) MoviesTable.getValueAt(MoviesTable.getSelectedRow(), NORMAL)) == 0) {
                temp = myBox.getMovies().get(i);
                if(myBox.getMovies().get(i).getQuantity() > 0){
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

        }

        myBox.addToCart(temp, myBox.getShoppingCart(), myBox.getMovies());

        System.out.println(myBox.getShoppingCart());

    }//GEN-LAST:event_AddToCartMovieActionPerformed

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed
        // TODO add your handling code here:
        String PassKey = JOptionPane.showInputDialog(rootPane, "Enter Your PassKey", DISPOSE_ON_CLOSE);
        if (PassKey.equalsIgnoreCase("12345")) {                                                        //passkey is 12345
            JOptionPane.showMessageDialog(AdminLogin, "PassKey Accepted");                              //display a message to the user
            PurpleBox.setEnabledAt(4, true);                                                            //enable ADMIN pane
            PurpleBox.setSelectedIndex(4);                                                              //take user to the ADMIN pane
        } else {
            JOptionPane.showMessageDialog(AdminLogin, "Wrong PassKey");                                 //display a message to the user
        }
    }//GEN-LAST:event_AdminLoginActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //String title = TitleField.getText();
        //String releaseYear = ReleaseYearField.getText();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ChangePriceBluRay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePriceBluRay1ActionPerformed
        // TODO add your handling code here:
        String newPrice = JOptionPane.showInputDialog("Enter a new price for BluRay: "); 
        myBox.changePriceBluRay(Double.parseDouble(newPrice), myBox.getMovies());
        MovieModel.setRowCount(0);
        AdminMovieModel.setRowCount(0);

        for (Disc disc : MovieList) {
            MovieModel.addRow(new Object[]{
                disc.getTitle(), disc.getGenre(), disc.getType(),
                disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
            AdminMovieModel.addRow(new Object[]{
                disc.getTitle(), disc.getGenre(), disc.getType(),
                disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
            
        }
    }//GEN-LAST:event_ChangePriceBluRay1ActionPerformed

    private void ChangePriceDVD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePriceDVD1ActionPerformed
        // TODO add your handling code here:
        String newPrice = JOptionPane.showInputDialog("Enter a new price for DVD: ");
        System.out.println(newPrice);
        myBox.changePriceDVD(Double.parseDouble(newPrice), myBox.getMovies());
        MovieModel.setRowCount(0);
        AdminMovieModel.setRowCount(0);

        for (Disc disc : MovieList) {
            MovieModel.addRow(new Object[]{
                disc.getTitle(), disc.getGenre(), disc.getType(),
                disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
            AdminMovieModel.addRow(new Object[]{
                disc.getTitle(), disc.getGenre(), disc.getType(),
                disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
            
        }   
    }//GEN-LAST:event_ChangePriceDVD1ActionPerformed

    private void RemoveAllAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAllAdmin1ActionPerformed
        // TODO add your handling code here:
        AdminMovieModel.setRowCount(0);
        AdminGameModel.setRowCount(0);
        MovieModel.setRowCount(0);
        GameModel.setRowCount(0);
        myBox.removeAll(myBox.getMovies());
        myBox.removeAll(myBox.getGames());
        
    }//GEN-LAST:event_RemoveAllAdmin1ActionPerformed

    private void Remove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove1ActionPerformed
        // TODO add your handling code here:
         myBox.setMovies(myBox.getMovies());
        int temp = 0;
             try{for (int i = 0; i < myBox.getMovies().size(); i++) {
                 if (myBox.getMovies().get(i).getTitle().compareTo((String) AdminMovieTable1.getValueAt(AdminMovieTable1.getSelectedRow(), 0)) == 0) {
                     temp = i;
                     AdminMovieModel.removeRow(i);
                     //System.out.println("i is: " + i);
                     break;
                 }
             }
             }catch(ArrayIndexOutOfBoundsException e){
                 //there's nothing to remove
             }
             myBox.remove(temp, myBox.getMovies()); 
             //if(!(myBox.getShoppingCart().isEmpty())) {
                 //    System.out.println(myBox.getShoppingCart());
                 //}
            try{for (int i = 0; i < myBox.getGames().size(); i++) {
                 if (myBox.getGames().get(i).getTitle().compareTo((String) AdminGameTable1.getValueAt(AdminGameTable1.getSelectedRow(), 0)) == 0) {
                     temp = i;
                     AdminGameModel.removeRow(i);
                     //System.out.println("i is: " + i);
                     break;
                 }
             }
             }catch(ArrayIndexOutOfBoundsException e){
                 //there's nothing to remove
             }
             myBox.remove(temp, myBox.getGames()); 
        
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
        myBox.setShoppingCart(ShoppingCartList);
        CartModel.setRowCount(0);
        myBox.removeAll(myBox.getShoppingCart());
    }//GEN-LAST:event_RemoveAllButtonActionPerformed

    private void RemoveFromCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFromCartButtonActionPerformed
        // TODO add your handling code here:
        myBox.setShoppingCart(ShoppingCartList);
        int temp = 0;
        try{for (int i = 0; i < myBox.getShoppingCart().size(); i++) {
            if (myBox.getShoppingCart().get(i).getTitle().compareTo((String) ShoppingCartTable.getValueAt(ShoppingCartTable.getSelectedRow(), 0)) == 0) {
                temp = i;
                CartModel.removeRow(i);
                //System.out.println("i is: " + i);
                break;
            }
        }
        }catch(ArrayIndexOutOfBoundsException e){
            //there's nothing to remove
        }
        System.out.println(myBox.getShoppingCart());

        myBox.remove(temp, myBox.getShoppingCart());
        //if(!(myBox.getShoppingCart().isEmpty())) {
            //    System.out.println(myBox.getShoppingCart());
            //}
        ShoppingCartOutput.append(myBox.getShoppingCart().get(temp).getTitle() + " has been removed from your cart. \n");
    }//GEN-LAST:event_RemoveFromCartButtonActionPerformed

    private void TitleFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleFieldMouseClicked
        TitleField.selectAll();
    }//GEN-LAST:event_TitleFieldMouseClicked

    private void TitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleFieldActionPerformed

    private void ChangePriceGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePriceGameButtonActionPerformed
        // TODO add your handling code here:
        String newPrice = JOptionPane.showInputDialog("Enter a new price for Games: ");
        System.out.println(newPrice);
        myBox.changePriceGame(Double.parseDouble(newPrice), myBox.getGames());
        GameModel.setRowCount(0);
        AdminGameModel.setRowCount(0);

        for (Disc disc : GameList) {
            GameModel.addRow(new Object[]{
                disc.getTitle(), disc.getGenre(), disc.getType(),
                disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
            AdminGameModel.addRow(new Object[]{
                disc.getTitle(), disc.getGenre(), disc.getType(),
                disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
            
        }
    }//GEN-LAST:event_ChangePriceGameButtonActionPerformed

    private void ReleaseYearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReleaseYearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReleaseYearFieldActionPerformed

    private void ReleaseYearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReleaseYearFieldMouseClicked
        // TODO add your handling code here:
        ReleaseYearField.selectAll();
    }//GEN-LAST:event_ReleaseYearFieldMouseClicked

    private void AdminMovieTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminMovieTable1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AdminMovieTable1MouseClicked

    private void PurpleBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PurpleBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PurpleBoxMouseClicked

    private void AddDiscButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDiscButtonActionPerformed
        // TODO add your handling code here:
        String title = TitleField.getText();
        String genre = (String)GenreCombo.getSelectedItem();
        String type = (String)TypeCombo.getSelectedItem();
        String releaseYear = ReleaseYearField.getText();
        int criticScore = Integer.parseInt(CriticScoreField.getText());
        int quantity = Integer.parseInt(QuantityField.getText());
        double price = Double.parseDouble((String)PriceCombo.getSelectedItem());
        
        if (type.equalsIgnoreCase("DVD")||type.equalsIgnoreCase("BluRay")){
            myBox.getMovies().add(new Disc(title,genre,type,releaseYear,criticScore,quantity,price));
            MovieModel.setRowCount(0);
            AdminMovieModel.setRowCount(0);

            for (Disc disc : MovieList) {
                MovieModel.addRow(new Object[]{
                    disc.getTitle(), disc.getGenre(), disc.getType(),
                    disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
                AdminMovieModel.addRow(new Object[]{
                    disc.getTitle(), disc.getGenre(), disc.getType(),
                    disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});

            }
        }else if(type.equalsIgnoreCase("PS4")||type.equalsIgnoreCase("XboxOne")){
            myBox.getGames().add(new Disc(title,genre,type,releaseYear,criticScore,quantity,price));
            GameModel.setRowCount(0);
            AdminGameModel.setRowCount(0);

            for (Disc disc : GameList) {
                GameModel.addRow(new Object[]{
                    disc.getTitle(), disc.getGenre(), disc.getType(),
                    disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});
                AdminGameModel.addRow(new Object[]{
                    disc.getTitle(), disc.getGenre(), disc.getType(),
                    disc.getRelease(), disc.getCriticScore(), disc.getQuantity(), disc.getPrice()});

            }
        }
        
        
    }//GEN-LAST:event_AddDiscButtonActionPerformed

    private void CriticScoreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriticScoreFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CriticScoreFieldActionPerformed

    private void CriticScoreFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CriticScoreFieldMouseClicked
        // TODO add your handling code here:
        CriticScoreField.selectAll();
    }//GEN-LAST:event_CriticScoreFieldMouseClicked

    private void QuantityFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantityFieldMouseClicked
        // TODO add your handling code here:
        QuantityField.selectAll();
    }//GEN-LAST:event_QuantityFieldMouseClicked

    private void GetTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetTotalButtonActionPerformed
        // TODO add your handling code here:
        if(total == 0){
            for(Disc disc : myBox.getShoppingCart()){
                total += disc.getPrice();
            }
        }
        ShoppingCartOutput.append("Your total is : $" + total + "\n");
    }//GEN-LAST:event_GetTotalButtonActionPerformed

    private void SubmitCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitCodeButtonActionPerformed
        // TODO add your handling code here:
        for(PromoCode code : myBox.getPromoCode()){
            if(code.getCode() == Integer.parseInt(CodeTextField.getText())){
                if(total == 0){
                    for(Disc disc: myBox.getShoppingCart()){
                        total += disc.getPrice();
                    }
                }

                double newTotal = myBox.promoCode(code.getCodeType(), total);
                total = newTotal;
                ShoppingCartOutput.append("Your new total is : $" + total + "\n");

                SubmitCodeButton.setEnabled(false);
            }
        }
    }//GEN-LAST:event_SubmitCodeButtonActionPerformed

    private void addPromoCodeFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPromoCodeFieldMouseClicked
        // TODO add your handling code here:
        addPromoCodeField.selectAll();
    }//GEN-LAST:event_addPromoCodeFieldMouseClicked

    private void CodeTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodeTextFieldMouseClicked
        // TODO add your handling code here:
        CodeTextField.selectAll();
    }//GEN-LAST:event_CodeTextFieldMouseClicked

    private void AddPromoCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPromoCodeButtonActionPerformed
        // TODO add your handling code here:
        int code = Integer.parseInt(addPromoCodeField.getText());
        int codeType = Integer.parseInt((String)codeTypeCombo.getSelectedItem());
        myBox.getPromoCode().add(new PromoCode(code,codeType));
    }//GEN-LAST:event_AddPromoCodeButtonActionPerformed

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
    private javax.swing.JButton AddDiscButton;
    private javax.swing.JButton AddPromoCodeButton;
    private javax.swing.JButton AddToCartGame;
    private javax.swing.JButton AddToCartMovie;
    private javax.swing.JTable AdminGameTable1;
    private javax.swing.JButton AdminLogin;
    private javax.swing.JTable AdminMovieTable1;
    private javax.swing.JButton ChangePriceBluRay1;
    private javax.swing.JButton ChangePriceDVD1;
    private javax.swing.JButton ChangePriceGameButton;
    private javax.swing.JButton CheckoutButton;
    private javax.swing.JLabel CodeLabel2;
    private java.awt.TextField CodeTextField;
    private java.awt.TextField CriticScoreField;
    private java.awt.Panel Games;
    private javax.swing.JTable GamesTable;
    private javax.swing.JComboBox<String> GenreCombo;
    private javax.swing.JButton GetTotalButton;
    private java.awt.Panel Home;
    private java.awt.Label HomeMessage;
    private java.awt.Panel Movies;
    private javax.swing.JTable MoviesTable;
    private javax.swing.JComboBox<String> PriceCombo;
    private javax.swing.JTabbedPane PurpleBox;
    private java.awt.TextField QuantityField;
    private java.awt.TextField ReleaseYearField;
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
    private javax.swing.JTextField TitleField;
    private javax.swing.JComboBox<String> TypeCombo;
    private java.awt.TextField addPromoCodeField;
    private javax.swing.JComboBox<String> codeTypeCombo;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private java.awt.Label label1;
    private javax.swing.JButton returnGame;
    private javax.swing.JButton returnMovie;
    private java.awt.TextField textField1;
    private java.awt.TextField textField11;
    private java.awt.TextField textField8;
    private java.awt.TextField textField9;
    // End of variables declaration//GEN-END:variables
}
