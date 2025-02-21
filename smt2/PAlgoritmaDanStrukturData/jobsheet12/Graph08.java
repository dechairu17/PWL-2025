public class Graph08 {
    int vertex;
    DoubleLinkedList08 list[];
    int edge;

    public Graph08(int v) {
        vertex = v;
        list = new DoubleLinkedList08[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList08();
        }
    }
    public int edge(){
        return edge;
    }
    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = list[asal].size();

        for (int i = 0; i < vertex; i++) {
            if (i != asal) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == asal) {
                        totalIn++;
                    }
                }
            }
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].remove(i);
                break;
            }
        }
    }

    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void cekEdge(int asal, int tujuan) throws Exception { 
        boolean found = false; 
        for (int i = 0; i < list[asal].size(); i++) { 
            if (list[asal].get(i) == tujuan) { 
                found = true; 
                break; 
            } 
        } 
        if (found) { 
            System.out.println("Gedung " + (char) ('A' + asal) + " Dan " + (char) ('A' + tujuan) + " Bertetangga"); 
        } else { 
            System.out.println("Gedung " + (char) ('A' + asal) + " Dan " + (char) ('A' + tujuan) + " Tidak Bertetangga"); 
        } 
    }
    
    public void updateJarak(int asal, int tujuan, int jarak) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].head.jarak = jarak;
                return;
            }
        }
        throw new Exception("Edge tidak ditemukan.");
    }

    public int hitungEdge() { 
        int totalEdges = 0; 
        for (int i = 0; i < vertex; i++) { 
            totalEdges += list[i].size(); 
        } 
        return totalEdges; 
    } 
}