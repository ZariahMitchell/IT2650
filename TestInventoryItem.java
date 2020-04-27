public class TestInventoryItem
{
 public static void main(String[] args)
 {
  InventoryItem[] items = new InventoryItem[6];

  items[0] = new InventoryItem("Apples", 369);
  items[1] = new InventoryItem("Bucket", 891);
  items[2] = new InventoryItem("Plate", 753);
  items[3] = new InventoryItem("Shampoo", 214);
  items[4] = new InventoryItem("Bag", 591);
  items[5] = new InventoryItem("Mobile", 435);

  System.out.println("Inventory items before sorting:");
  printItems(items);

  sortItems(items);

  System.out.println("\n\nInventory items after sorting:");
  printItems(items);
 }

 public static void sortItems(Comparable[] items)
 {
  for(int i = 1; i < items.length; i++)
  {
   for(int j = i; j > 0; j--)
   {
    if(items[j].compareTo(items[j - 1]) < 0)
    {
     Comparable temp = items[j];
     items[j] = items[j - 1];
     items[j - 1] = temp;
    }
   }
  }
 }

 public static void printItems(InventoryItem[] items)
 {
  System.out.printf("\n%-12s%6s\n", "Name", "ID");
  System.out.println("------------------");
  for(int i = 0; i < items.length; i++)
  {
   System.out.printf("%-12s%6d\n", items[i].getName(),
     items[i].getUniqueItemID());
  }
 }
}