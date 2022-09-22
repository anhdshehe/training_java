import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Playground {
    public static void main(String[] args) {
        int Input_Array[] = { 10, 30, 50, 70, 90, 100 };
        int r = 3;
        int n = Input_Array.length;
        ArrayList<int[]> combinations = Find_Combination(Input_Array, n, r);
        Print_Combination(combinations);
    }

    static void CombinationPossible(int Input_Array[], int Combination_Arr[], ArrayList<int[]> List_combination,
            int Start_Element, int End_Element, int Array_Index, int r) {
        // Current combination is ready to be printed, print it
        if (Array_Index == r) {
            int[] copy_arr = new int[r];
            for (int x = 0; x < r; x++) {
                copy_arr[x] = Combination_Arr[x];
            }
            List_combination.add(List_combination.size(), copy_arr);
            return;
        }

        for (int y = Start_Element; y <= End_Element && End_Element - y + 1 >= r - Array_Index; y++) {
            Combination_Arr[Array_Index] = Input_Array[y];
            CombinationPossible(Input_Array, Combination_Arr, List_combination, y + 1, End_Element, Array_Index + 1, r);
        }
    }

    static ArrayList<int[]> Find_Combination(int Input_Array[], int n, int r) {
        ArrayList<int[]> result2 = new ArrayList<int[]>();
        int Empty_Array[] = new int[r];
        CombinationPossible(Input_Array, Empty_Array, result2, 0, n - 1, 0, r);
        return result2;
    }


    static void Print_Combination(ArrayList<int[]> result2) {
        for (int[] element : result2) {
            for (int abc: element)
            {
                System.out.print(abc + " ");
            }
            System.out.println("");
        }
    }
}