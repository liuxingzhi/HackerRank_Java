/*******************************************************************************
 * Copyright 2018 Francesco Cina'
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package ufo.codility.challenges;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChessKnightTest {

	@Test
	public void test() {
		final int board = 8;
		assertEquals(6, ChessKnight.BFS(new Node(0, 7), new Node(7, 0), board));
		assertEquals(0, ChessKnight.BFS(new Node(0, 0), new Node(0, 0), board));
	}

}
