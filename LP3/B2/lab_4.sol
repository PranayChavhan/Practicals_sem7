// SPDX-License-Identifier: Bhide License
pragma solidity ^0.8.0;

contract StudentRegistry {
    struct Student {
        uint256 rollNo;
        string name;
        uint256 age;
    }

    Student[] private students;
    mapping(uint256 => uint256) private studentIndexByRollNo; // Maps rollNo to index in the students array

    // Define an event to log the received Ether value
    event ReceivedEther(address indexed sender, uint256 value);

    receive() external payable {
        // This function can receive Ether, but it doesn't do anything in this example.
        // Log the received Ether value
        emit ReceivedEther(msg.sender, msg.value);
    }

    fallback() external payable {
        // Fallback function to receive Ether
        emit ReceivedEther(msg.sender, msg.value);
    }

    function addStudent(uint256 rollNo, string memory name, uint256 age) public {
        require(studentIndexByRollNo[rollNo] == 0 && (students.length == 0 || students[0].rollNo != rollNo), "Roll number already exists");
        students.push(Student(rollNo, name, age));
        studentIndexByRollNo[rollNo] = students.length - 1; // Store the index for the roll number
    }

    function getStudent(uint256 rollNo) public view returns (string memory, uint256) {
        uint256 index = studentIndexByRollNo[rollNo];
        require(index < students.length && students[index].rollNo == rollNo, "Student not found");
        Student memory student = students[index];
        return (student.name, student.age);
    }

    function getStudentCount() public view returns (uint256) {
        return students.length;
    }
}
