Circular buffer
###1. Data structure ? (Internal)
* Array of String
###2. Operations/Behavior/Methods ?  user -> CB ?
* writeData(string):void
* readData(): string
* isFull(): boolean
* isEmpty(): boolean
* setSize(int): void
###3. Internal process ?
* buffer size = 10 (default)
* read pointer = 0
* write pointer = 0
###4. List of testcases
* TC01 => newBufferShouldBeEmpty
     Conditions: check if newly created buffer is empty
* TC02 => newBufferSizeShouldBe10
     Conditions: check if newly created buffer's size is 10
* TC03 => writingABufferReadA
     Conditions: check if writing "A" to a buffer and then read should return "A"
* TC04 => writingAThenBBufferReadAThenB
     Conditions: check if writing "A" then "B" to a buffer should then read "A" then "B"
* TC05 => writing10TimesShouldMakeBufferFull
     Conditions: check if writing strings to a buffer 10 times will make buffer full
* TC06 => writing11TimesShouldOverwriteFirstString
     Conditions: writing to a buffer 11 times should overwrite first wrote string with the latest string
