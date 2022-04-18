public class tokoonline {
    private String namabarang;
    private String jenisbarang;
    private int hargabarang;
    private String deskripsibarsng;
    private String asalbarang;
    private String statusstock;

    public tokoonline(String namabarang,String jenisbarang,int hargabarang,String deskripsibarsng,String asalbarang,String statusstock)(
        this.namabarang = namabarang;
        this.jenisbarang = jenisbarang;
        this.hargabarang = hargabarang;
        this.deskripsibarsng = deskripsibarsng;
        this.asalbarang = asalbarang;
        this.statusstock = statusstock; 

    public class tokped {
        public static void main(String[] args) {
            ArrayList<tokped> daftartokped = new ArrayList<tokped>();
            for (int index = 0; index < 3; index++) {
                tokped = new tokped();
                Scanner detailInput = new Scanner(System.in);
                System.out.println("Masukkan namabarang :");
                tokped.namabarang = detailInput.nextLine();
    
                System.out.println("Masukkan jenisbarang :");
                tokped.jenisbarang = detailInput.nextLine();
    
                System.out.println("Masukkan deskripsi barang : ");
                tokped.deskripsibarang = detailInput.nextLine();
    
                System.out.println("Masukkan asal barang");
                tokped.asalbarang = detailInput.nextLine();
    
                daftartokped.add(tokpped);
            }
    
            
        }

    } 

    
}


    
}
