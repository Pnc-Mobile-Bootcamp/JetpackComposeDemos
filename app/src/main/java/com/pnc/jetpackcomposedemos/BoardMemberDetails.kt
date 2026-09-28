package com.pnc.jetpackcomposedemos

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

@Composable
fun BoardMemberDetails(boardMember: BoardMember) {

    Column() {

        Text(
            text = "${boardMember.firstName} ${boardMember.lastName}",
            style = MaterialTheme.typography.titleMedium
        )

        Text(boardMember.title)




    }

}


