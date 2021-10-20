package com.qizi.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author : qizidog
 * @date : 2021-10-17 23:36
 * @description :
 **/

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class FolderEntry {
    private String folderId;
    private String folderName;
    private String folderCreationDate;
    private String folderCreator;
    private String folderParent;
    private int folderConstraint;
}