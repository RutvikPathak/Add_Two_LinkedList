# Add Two LinkedList

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.


## Explanation:
<b>list 1 contain : 331<br></b>
1 -> 3 -> 3 -> null<br><br>

<b>list 2 contain : 77<br></b>
7 -> 7 -> null <br><br>

<b>sum of linked list will be :<br></b>

|<b> Carry:</b>         | &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          1        |
| -------------        | ----------------   |
|<b> list_1.val:</b>    | 1 -> 3 -> 3 -> null|
|<b> list_1.val</b>    | 7 -> 7 -> null     |    
|<b> Sum:</b>           | 8 -> 0 -> 4       |

<br>

## Solution
* on class <b> ListNode </b> we have 2 attributes:
    - <b>val</b> : contain intiger value.
    - <b>next</b> : is an object of Listnode.

* after we create the constructor that pass intiger <b>val</b> and <b>next</b> object that contain <b>null</b> when ever we make a linked list node.

* <b>Add_two_num</b> is the important function where it takes 2 linked list from <b>main function</b> which are <b>l1 & l2 </b>and return the value in object
    - In this function we declare 3 variables :
        - <b>dummyhead</b>: This is an object of listnode that contain <b>0 val</b>.
        - <b>currentNode</b>: it is an object of the listnode that contain the value of <b>dummyhead</b>
        - <b>carry</b>: it is an intiger datatype that contain <b>0</b>.

    - Inside the <b>Add_two_num</b> function we take a while loop to perform addition
        - This loop will continue untill <b>l1,l2 </b>and <b>carry</b> all became <b>null</b> and <b>0</b>.
        - So, inside the loop intiger variable <b>l1_val</b> and <b>l2_val</b> will take the data of <b>l1.val</b> and <b>l2.val</b> only when the <b>l1</b> list is not empty if it is empty it will store <b>0</b>.
        - After the values has been retrive from both the list, start doing the sum.
            - we declare the intiger <b>sum</b> variable that add <b>l1_val + l2_val + carry</b>.<br>
            <b>Example :</b> l1 = 1->3->3 and l2 = 7->7 <br>
            l1_val=1 and and l2_val=7 and carry is 0 as it declare.
            - After we assigne the <b>currentNode.next</b> with new listnode object that contain value unit place of the value of sum. by the formula <b>sum%10</b><br>
            <b>Example :</b> l1 = 1->3->3 and l2 = 7->7 <br>
            2st Iteration of while loop will be:
            sum = l1_val + l2_val + carry <br>
            sum = 3 + 7 + 0 = 10 <br>
            currentNode.next = sum % 10 = 10 % 10 = 0. <br>
            - <b>currentNode=currentNode.next</b> is important for next iteration of currentNode as it will the pointer of the next node.
            - <b>carry=Math.abs(sum/10)</b>will take the absolute value of <b>sum/10</b>, this will only provide the tenth place of number.<br>
            <b>Example :</b> l1 = 1->3->3 and l2 = 7->7 <br>
            2st Iteration of while loop will be:
            sum = l1_val + l2_val + carry <br>
            sum = 3 + 7 + 0 = 10 <br>
            currentNode.next = sum % 10 = 10 % 10 = 0. <br>
            carry=Math.abs(sum/10)=10/10 = 1.
            - <b>if (l1!=null)l1=l1.next</b> and
            <b>if (l2!=null)l2=l2.next</b>In the final step of the while loop we iterate l1 and l2 link list by the pointer of its next node.
        - then we return the head node of current node.


            




