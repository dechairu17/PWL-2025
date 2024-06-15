public class GraphMainMatrix08 {
    public static void main(String[] args) {
        GraphMatriks08 gedung = new GraphMatriks08(4); 
        gedung.makeEdge(0, 1, 50); 
        gedung.makeEdge(1, 0, 60); 
        gedung.makeEdge(1, 2, 70); 
        gedung.makeEdge(2, 1, 80); 
        gedung.makeEdge(2, 3, 40); 
        gedung.makeEdge(3, 0, 90); 
        gedung.printGraph(); 
        System.out.println("Hasil setelah penghapusan edge"); 
        gedung.removeEdge(2, 1); 
        gedung.printGraph(); 

        System.out.println("OutDegree of vertex 2: " + gedung.outDegree(2));
        System.out.println("InDegree of vertex 2: " + gedung.inDegree(2));
        System.out.println("Degree of vertex 2: " + gedung.degree(2));
    }
}