Challenges while implmenting
- YouTube's search is extremely dynamic due to the number of videos, so search terms must be very precise.
- There is a possibility that tests could be affected by previous searches.
- In the ideal situation, an isolated test environment should be used to better control the search results.

Possible future improvements
- As of right now, the framework is divided by webpage. There may be a need for adjustments depending on the types of tests that need to be run.
If the bulk of the tests revolved around the actual YouTube videos, and not the YouTube website, it would probably be better to combine the framework into 1 class.
- The test cases could be expanded to include other web browsers. This would be as simple as implementing other WebDrivers and running them sequentially.

