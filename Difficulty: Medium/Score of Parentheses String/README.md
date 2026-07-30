<h2><a href="https://www.geeksforgeeks.org/problems/score-of-parentheses-string/1">Score of Parentheses String</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given a string <strong>s</strong>&nbsp;consisting of balanced parentheses, calculate the <strong>score</strong> of the string based on the following rules:</span></p>
<ul>
<li><span style="font-size: 14pt;">"()" has a score of 1.</span></li>
<li><span style="font-size: 14pt;">"AB" has a score of A + B, where A and B are balanced parentheses strings.</span></li>
<li><span style="font-size: 14pt;">"(A)" has a score of 2 × score(A), where A is a balanced parentheses string.</span></li>
</ul>
<p><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Note:&nbsp;</strong><span style="font-size: 18.6667px;">Test cases are generated such that the score will fit within a 32-bit integer.</span></span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "()()"
<strong>Output:</strong> 2
<strong>Explanation:</strong> </span><span style="font-size: 18.6667px;">The string str is of the form "ab", that makes the total score = (score of a) + (score of b) = 1 + 1 = 2.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "(()(()))"
<strong>Output:</strong> 6
<strong>Explanation: </strong></span><span style="font-size: 18.6667px;">The string str is of the form "(a(b))" which makes the total score = 2 × ((score of a) + 2 × (score of b)) = 2 × (1 + 2 × (1)) = 6.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "((()))"
<strong>Output:</strong> 4
<strong>Explanation: </strong></span><span style="font-size: 18.6667px;">The string str is of the form "((a))" which makes the total score = 2 × (2 × (score of a)) = 2 × (2 × (1)) = 4.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ s.size() ≤ 10<sup>5</sup><br>s[i] ∈ { '(' , ')' }</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Stack</code>&nbsp;<code>Strings</code>&nbsp;