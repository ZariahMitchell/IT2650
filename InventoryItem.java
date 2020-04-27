

public class InventoryItem implements Comparable
{
 private String name;
 private int uniqueItemID;

 public InventoryItem()
 {
  name = "";
  uniqueItemID =0 ;
 }

 public InventoryItem(String theName, int theUniqueItemID)
 {
  name = theName;
  uniqueItemID = theUniqueItemID;
 }

 public String getName()
 {
  return name;
 }

 public int getUniqueItemID()
 {
  return uniqueItemID;
 }

 public void setName(String theName)
 {
  name = theName;
 }

 public void setUniqueItemID(int theUniqueItemID)
 {
  uniqueItemID = theUniqueItemID;
 }

 public int compareTo(Object other)
 {
  InventoryItem otherItem = (InventoryItem)other;

  if(uniqueItemID < otherItem.uniqueItemID)
   return -1;
  else if(uniqueItemID > otherItem.uniqueItemID)
   return 1;
  else
   return 0;
 }
}